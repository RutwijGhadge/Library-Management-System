package Exception;

public class BillNotPresentException extends RuntimeException {
    public BillNotPresentException(String message) {
        super(message);
    }
}
