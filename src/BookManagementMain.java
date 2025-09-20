import Controller.BillController;
import Controller.ReceiptController;
import DTO.BillRequestDTO;
import DTO.BillResponseDTO;
import DTO.ReceiptRequestDTO;
import DTO.ReceiptResponseDTO;
import Repository.*;
import Service.InitService.InitServiceIMPL;
import Exception.UserNotPresentException;
import Exception.ReceiptNotFoundException;

public class BookManagementMain {
    public static void main(String[] args) throws UserNotPresentException, ReceiptNotFoundException {
        //Creating Repos
        BookRepository bookRepository = new BookRepository();
        UserRepository userRepository = new UserRepository();
        ReceiptRepository receiptRepository = new ReceiptRepository();
        BookCopyRepository bookCopyRepository=new BookCopyRepository();
        BillRepository billRepository=new BillRepository();

        //Initializing Library System with Data
        InitServiceIMPL initServiceIMPL=new InitServiceIMPL(bookRepository, userRepository,bookCopyRepository, receiptRepository,billRepository);
        initServiceIMPL.init();

        ReceiptRequestDTO receiptRequestDTO=new ReceiptRequestDTO();
        receiptRequestDTO.setBookId(1);
        receiptRequestDTO.setLibraryName("Young Brigade Library");
        receiptRequestDTO.setUserId(1);

        //Receipt Creation
        ReceiptController receiptController=new ReceiptController(bookRepository, userRepository, receiptRepository);
        receiptController.createReceipt(receiptRequestDTO);

        System.out.println("Receiving Receipt for Book with Id:" + 1);
        ReceiptResponseDTO receiptResponseDTO= receiptController.getReceipt(1);
        System.out.println(receiptResponseDTO.toString());

        //Creating Bill
        BillRequestDTO billRequestDTO = new BillRequestDTO();
        billRequestDTO.setBill_id(receiptResponseDTO.getReceipt_Id());
        BillController billController=new BillController(receiptRepository,billRepository);
        billController.createBill(billRequestDTO);

        System.out.println("Receiving Bill For a Particular Receipt with Receipt ID:"+ receiptResponseDTO.getReceipt_Id());
        BillResponseDTO billResponseDTO=billController.getBill(billRequestDTO);
        System.out.println(billResponseDTO.toString());

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

