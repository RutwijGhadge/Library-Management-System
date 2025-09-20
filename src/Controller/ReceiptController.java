package Controller;
import DTO.ReceiptRequestDTO;
import DTO.ReceiptResponseDTO;
import Models.Receipt;
import Repository.*;
import Service.ReceiptService.ReceiptServiceIMPL;
import Exception.UserNotPresentException;

public class ReceiptController {
    private final ReceiptServiceIMPL receiptServiceIMPL;

    public ReceiptController(BookRepository bookRepository, UserRepository userRepository , ReceiptRepository receiptRepository){
        this.receiptServiceIMPL=new ReceiptServiceIMPL(bookRepository,userRepository,receiptRepository);
    }

    public void createReceipt(ReceiptRequestDTO receiptRequestDTO) throws UserNotPresentException {
        receiptServiceIMPL.createReceipt(receiptRequestDTO.getUserId(),receiptRequestDTO.getBookId(),receiptRequestDTO.getLibraryName());
    }

    public ReceiptResponseDTO getReceipt(int receiptId){
        Receipt receipt = receiptServiceIMPL.getReceipt(receiptId);
        return getResponseDTOFromReceipt(receipt);
    }

    public ReceiptResponseDTO getResponseDTOFromReceipt(Receipt receipt){
        ReceiptResponseDTO receiptResponseDTO = new ReceiptResponseDTO();
        receiptResponseDTO.setBookName(receipt.getBook().getBookName());
        receiptResponseDTO.setLibraryName(receipt.getLibraryName());
        receiptResponseDTO.setTimeOfPurchase(receipt.getTimeOfPurchase().toString());
        receiptResponseDTO.setReceipt_Id(receipt.getReceiptId());
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