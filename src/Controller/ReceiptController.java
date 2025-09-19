package Controller;
import DTO.ReceiptRequestDTO;
import DTO.ReceiptResponseDTO;
import Models.Bill;
import Models.Receipt;
import Repository.*;
import Service.ReceiptServiceIMPL;
import Exception.UserNotPresentException;

public class ReceiptController {
    private final ReceiptServiceIMPL receiptServiceIMPL;

    public ReceiptController(BookRepository bookRepository, UserRepository userRepository , ReceiptRepository receiptRepository){
        this.receiptServiceIMPL=new ReceiptServiceIMPL(bookRepository,userRepository,receiptRepository);
    }

    public ReceiptResponseDTO createReceipt(ReceiptRequestDTO receiptRequestDTO) throws UserNotPresentException {
        Receipt receipt=receiptServiceIMPL.createReceipt(receiptRequestDTO.getUserId(),receiptRequestDTO.getBookId(),receiptRequestDTO.getLibraryName());

        ReceiptResponseDTO receiptResponseDTO=new ReceiptResponseDTO();
        receiptResponseDTO.setBookName(receipt.getBook().getBookName());
        receiptResponseDTO.setLibraryName(receipt.getLibraryName());
        receiptResponseDTO.setTimeOfPurchase(receipt.getTimeOfPurchase().toString());
        receiptResponseDTO.setTimeOfReturn(receipt.getExpectedTimeOfReturn().toString());
        return receiptResponseDTO;
    }

}



/*
    Information Needed to Create a Ticket
    1. Book information
    2. Time
    3. UserInformation
 */