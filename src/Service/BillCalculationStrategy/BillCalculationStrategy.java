package Service.BillCalculationStrategy;

import Models.Book;
import Models.Constants.Category;
import Models.Receipt;

import java.time.LocalDateTime;

public interface BillCalculationStrategy {
    double calculateBillAmount(Category category , LocalDateTime timeOfPurchase, LocalDateTime timeOfReturn);
}
