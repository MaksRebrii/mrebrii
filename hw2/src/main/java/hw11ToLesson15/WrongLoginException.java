package hw11ToLesson15;

public class WrongLoginException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "Wrong login.";

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message == null ? DEFAULT_MESSAGE : DEFAULT_MESSAGE + " " + message);
    }
}
