package collectionsqueue.job;

public class NoJobException extends RuntimeException{

    private String message;

    public NoJobException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
