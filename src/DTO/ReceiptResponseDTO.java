package DTO;

public class ReceiptResponseDTO {
    private String timeOfPurchase;
    private String timeOfReturn;
    private String bookName;
    private String libraryName;

    @Override
    public String toString() {
        return "ReceiptResponseDTO {\n" +
                "  timeOfPurchase='" + timeOfPurchase + "',\n" +
                "  timeOfReturn='" + timeOfReturn + "',\n" +
                "  bookName='" + bookName + "',\n" +
                "  libraryName='" + libraryName + "'\n" +
                '}';
    }

    public String getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public void setTimeOfPurchase(String timeOfPurchase) {
        this.timeOfPurchase = timeOfPurchase;
    }

    public String getTimeOfReturn() {
        return timeOfReturn;
    }

    public void setTimeOfReturn(String timeOfReturn) {
        this.timeOfReturn = timeOfReturn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
}

/*
Data that User wants to know on the Receipt
 */