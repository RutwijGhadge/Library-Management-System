package Service.BillCalculationStrategy;

import Models.Book;
import Models.Receipt;

import java.time.LocalDateTime;

public interface BillCalculationStrategy {
    public double calculateBillAmount(Receipt receipt, LocalDateTime timeOfReturn);
}
