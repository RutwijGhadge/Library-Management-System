package Service;

import Models.Book;
import Models.Receipt;
import Exception.UserNotPresentException;

public interface ReceiptService {

    Receipt createReceipt(int userId, int bookId, String libraryName) throws UserNotPresentException;

}
