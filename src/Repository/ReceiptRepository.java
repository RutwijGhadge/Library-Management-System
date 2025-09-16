package Repository;

import Models.Receipt;

import java.util.HashMap;
import Exception.ReceiptNotFoundException;
import Exception.ReceiptAlreadyPresentException;

public class ReceiptRepository {
    private final HashMap<Integer, Receipt>receiptRepository;

    public ReceiptRepository() {
        this.receiptRepository = new HashMap<>();
    }

    public Receipt getReceipt(int id) throws ReceiptNotFoundException {
        if(!receiptRepository.containsKey(id)){
            throw new ReceiptNotFoundException("Receipt with id :"+id+ " Not Present");
        }
        return receiptRepository.get(id);
    }

    public Receipt addReceipt(Receipt receipt) throws ReceiptAlreadyPresentException {
        if(receiptRepository.containsKey(receipt.receiptId)){
            throw new ReceiptAlreadyPresentException("Receipt With id :"+receipt.receiptId+" is already Present");
        }else{
            receiptRepository.put(receipt.receiptId,receipt);
            System.out.println("Receipt Saved Successfully");
        }
        return receipt;
    }
}
