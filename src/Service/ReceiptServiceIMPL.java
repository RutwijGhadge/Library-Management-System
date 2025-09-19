package Service;

import Exception.UserNotPresentException;
import Models.Book;
import Models.Receipt;
import Models.User;
import Repository.*;

import java.time.LocalDateTime;

public class ReceiptServiceIMPL implements ReceiptService{
    private final UserRepository userRepository;
    private final BookRepository bookRepository;
    private final ReceiptRepository receiptRepository;

    private static int receiptId=0;

    public ReceiptServiceIMPL(BookRepository bookRepository, UserRepository userRepository, ReceiptRepository receiptRepository) {
        this.bookRepository=bookRepository;
        this.userRepository=userRepository;
        this.receiptRepository=receiptRepository;
    }

    public static int getNextId() {
        return ++receiptId; // increments first, then returns
    }

    @Override
    public Receipt createReceipt(int userId, int bookId, String libraryName) throws UserNotPresentException {
        User user= userRepository.getUser(userId);
        Book book= bookRepository.findById((long) bookId);

        Receipt new_receipt=new Receipt();
        new_receipt.setReceiptId(getNextId());
        new_receipt.setBook(book);
        new_receipt.setUser(user);
        new_receipt.setLibraryName(libraryName);
        new_receipt.setTimeOfPurchase(LocalDateTime.now());
        new_receipt.setExpectedTimeOfReturn(LocalDateTime.now().plusMonths(1L)); //return after 1 Month
        return receiptRepository.addReceipt(new_receipt);
    }
}
