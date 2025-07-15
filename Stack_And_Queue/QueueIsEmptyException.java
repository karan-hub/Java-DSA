package Stack_And_Queue;

public class QueueIsEmptyException extends RuntimeException {
    public QueueIsEmptyException() {
        super("This Queue Is Empty");
    }
}
