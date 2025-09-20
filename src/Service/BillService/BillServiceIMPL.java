package Service.BillService;

import Models.Bill;
import Models.Book;
import Models.Constants.Category;
import Models.Receipt;
import Models.User;
import Repository.BillRepository;
import Repository.ReceiptRepository;
import Service.BillCalculationStrategy.CalculateBill;
import Exception.ReceiptNotFoundException;
import java.time.LocalDateTime;

public class BillServiceIMPL implements BillService {
    public ReceiptRepository receiptRepository;
    public BillRepository billRepository;

    public BillServiceIMPL(ReceiptRepository receiptRepository, BillRepository billRepository){
        this.billRepository= billRepository;
        this.receiptRepository=receiptRepository;
    }

    //Bill_Id and Receipt_Id are Same.
    @Override
    public void createBill(int receiptId) throws ReceiptNotFoundException {

        Receipt receipt= receiptRepository.getReceipt(receiptId);
        User user= receipt.getUser();
        int billId = receipt.getReceiptId();
        Book book = receipt.getBook();

        CalculateBill calculateBill=new CalculateBill();
        LocalDateTime purchaseDate = receipt.getTimeOfPurchase();
        Category category=receipt.getBook().getCategory();
        LocalDateTime returnDate = LocalDateTime.now().plusMonths(1L);
        double amountToBePaid = calculateBill.calculateBillAmount(category,purchaseDate,returnDate);

        Bill bill=new Bill();
        bill.setBillId(billId);
        bill.setBook(book);
        bill.setUser(user);
        bill.setAmountToBePaid(amountToBePaid);

        billRepository.addBill(bill);
    }

    @Override
    public Bill getBill(int bill_Id) {
        return billRepository.getBill(bill_Id);
    }

}
