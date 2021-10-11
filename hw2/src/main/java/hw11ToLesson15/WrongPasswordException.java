package hw11ToLesson15;

public class WrongPasswordException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "Wrong password.";

    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message == null ? DEFAULT_MESSAGE : DEFAULT_MESSAGE + " " + message);
    }
}
