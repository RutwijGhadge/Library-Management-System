package Service.ReceiptService;

import Models.Receipt;
import Exception.UserNotPresentException;

public interface ReceiptService {

    void createReceipt(int userId, int bookId, String libraryName) throws UserNotPresentException;

    Receipt getReceipt(int bookId) ;
}
