package Repository;

import Models.Receipt;

import java.util.HashMap;
import Exception.ReceiptNotFoundException;

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

    public Receipt addReceipt(Receipt receipt)  {
        receiptRepository.put(receipt.receiptId,receipt);
        return receipt;
    }
}
