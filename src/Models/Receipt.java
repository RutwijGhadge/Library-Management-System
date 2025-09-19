package Models;

import java.time.LocalDateTime;

public class Receipt {
   public int receiptId;
   public User user;
   public Book book;
   public String libraryName;
   public LocalDateTime timeOfPurchase;
   public LocalDateTime expectedTimeOfReturn;

    public LocalDateTime getExpectedTimeOfReturn() {
        return expectedTimeOfReturn;
    }

    public void setExpectedTimeOfReturn(LocalDateTime expectedTimeOfReturn) {
        this.expectedTimeOfReturn = expectedTimeOfReturn;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public void setTimeOfPurchase(LocalDateTime timeOfPurchase) {
        this.timeOfPurchase = timeOfPurchase;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public LocalDateTime getDateOfPurchase() {
        return timeOfPurchase;
    }

    public void setDateOfPurchase(LocalDateTime timeOfPurchase) {
        this.timeOfPurchase = timeOfPurchase;
    }
}
