package Exception;

public class BookNotPresentException extends RuntimeException {
    public BookNotPresentException(String message) {
        super(message);
    }
}
