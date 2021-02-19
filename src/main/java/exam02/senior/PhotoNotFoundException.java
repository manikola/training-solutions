package exam02.senior;

public class PhotoNotFoundException extends RuntimeException{

    public PhotoNotFoundException() {
        super();
    }

    public PhotoNotFoundException(String msg) {
        super(msg);
    }

    public PhotoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
