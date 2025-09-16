package Repository;

import Models.Bill;

import java.util.HashMap;
import Exception.BillNotPresentException;

public class BillRepository {
    public final HashMap<Integer, Bill>billRepository;

    public BillRepository() {
        this.billRepository = new HashMap<>();
    }

    public Bill getBill(Bill bill){
        if(!billRepository.containsKey(bill.getBillId())){
            throw new BillNotPresentException("Bill with id: "+bill.getBillId()+" is not Present");
        }else {
            return billRepository.get(bill.getBillId());
        }
    }

    public void addBill(Bill bill){
        billRepository.put(bill.getBillId(),bill);
        System.out.println("Bill with Id :"+bill.getBillId()+" added Successfully.");
    }

}
