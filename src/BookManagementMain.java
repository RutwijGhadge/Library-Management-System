import Controller.ReceiptController;
import DTO.ReceiptRequestDTO;
import DTO.ReceiptResponseDTO;
import Models.Book;
import Models.Receipt;
import Repository.*;
import Service.InitServiceIMPL;
import Exception.UserNotPresentException;

public class BookManagementMain {
    public static void main(String[] args) throws UserNotPresentException {

        BookRepository bookRepository = new BookRepository();
        UserRepository userRepository = new UserRepository();
        ReceiptRepository receiptRepository = new ReceiptRepository();
        BookCopyRepository bookCopyRepository=new BookCopyRepository();
        BillRepository billRepository=new BillRepository();

        InitServiceIMPL initServiceIMPL=new InitServiceIMPL(bookRepository,userRepository,bookCopyRepository,receiptRepository,billRepository);
        initServiceIMPL.init();

        ReceiptRequestDTO receiptRequestDTO=new ReceiptRequestDTO();
        receiptRequestDTO.setBookId(1);
        receiptRequestDTO.setLibraryName("Young Brigade Library");
        receiptRequestDTO.setUserId(1);

        //Receipt Creation
        ReceiptController receiptController=new ReceiptController(bookRepository,userRepository,receiptRepository);
        ReceiptResponseDTO receiptResponseDTO=receiptController.createReceipt(receiptRequestDTO);

        System.out.println("Your Receipt has been Created with the Following Details.");
        System.out.println(receiptResponseDTO.toString());



    }
}


/*
 flow
    - Models
    - Repositories
    - Exceptions
    - Strategies
    - initService
    - ReceiptService
    - Controller
    - DTOs
 */

