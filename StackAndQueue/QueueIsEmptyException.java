package StackAndQueue;

public class QueueIsEmptyException extends RuntimeException {
    public QueueIsEmptyException() {
        super("This Queue Is Empty");
    }
}
