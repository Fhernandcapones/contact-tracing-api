package contact.v1.exception;

public class Message {
    private final String message;

    public String getMessage() {
        return message;
    }

    public Message(String message) {
        this.message = message;
    }
    public static Message of(String message) {
        return new Message(message);
    }


}
