package Repository;

import Models.Bill;

import java.util.HashMap;
import Exception.BillNotPresentException;

public class BillRepository {
    public final HashMap<Integer, Bill>billRepository;

    public BillRepository() {
        this.billRepository = new HashMap<>();
    }

    public Bill getBill(int bill_id){
        if(!billRepository.containsKey(bill_id)){
            throw new BillNotPresentException("Bill with id: "+bill_id+" is not Present");
        }else {
            return billRepository.get(bill_id);
        }
    }

    public void addBill(Bill bill){
        billRepository.put(bill.getBillId(), bill);
    }

}
