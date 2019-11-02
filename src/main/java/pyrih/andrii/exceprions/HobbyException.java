package pyrih.andrii.exceprions;

public class HobbyException extends Exception {
    public HobbyException() {
    }

    public HobbyException(String message) {
        super(message);
    }

    public HobbyException(String message, Throwable cause) {
        super(message, cause);
    }

    public HobbyException(Throwable cause) {
        super(cause);
    }

    public HobbyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
