package Service.BillService;

import Models.Bill;
import Exception.ReceiptNotFoundException;
public interface BillService {
     void createBill(int id) throws ReceiptNotFoundException;
     //without Receipt bill cannot be generated

     Bill getBill(int bill_Id);
}
