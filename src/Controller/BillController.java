package Controller;

import DTO.BillRequestDTO;
import DTO.BillResponseDTO;
import Models.Bill;
import Repository.BillRepository;
import Repository.ReceiptRepository;
import Service.BillService.BillServiceIMPL;
import Exception.ReceiptNotFoundException;

public class BillController {
    public BillServiceIMPL billServiceIMPL;

    public BillController(ReceiptRepository receiptRepository, BillRepository billRepository){
        this.billServiceIMPL=new BillServiceIMPL(receiptRepository,billRepository);
    }

    public void createBill(BillRequestDTO billRequestDTO) throws ReceiptNotFoundException {
        billServiceIMPL.createBill(billRequestDTO.getBill_id());
    }

    public BillResponseDTO getBill(BillRequestDTO billRequestDTO){
        Bill bill=billServiceIMPL.getBill(billRequestDTO.getBill_id());

        BillResponseDTO billResponseDTO=new BillResponseDTO();
        billResponseDTO.setBillId(bill.getBillId());
        billResponseDTO.setBookName(bill.getBook().getBookName());
        billResponseDTO.setUser(bill.getUser());
        billResponseDTO.setAmountToBePaid(bill.getAmountToBePaid());
        return billResponseDTO;
    }

}
