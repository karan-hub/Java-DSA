package StackAndQueue;

public class QueueArray<T> {
    Object [] queue;
    static  final  int DEFAULT_SIZE=5;
    int size=-1;

    public  QueueArray(int size){
        this.queue = new Object[size];
    }

   public QueueArray(){
        queue = new Object[DEFAULT_SIZE];
    }

    public  boolean add(T element) throws QueueIsFull {
        if (size >= this.queue.length-1 )
            throw  new QueueIsFull("Queue Is Full");

        queue[++size]=element;
        return true;
    }

    public  T offer()throws QueueIsEmptyException {
        if (size < 0) throw new  QueueIsEmptyException();
        T result = (T) this.queue[0];
        for (int i = 0; i < queue.length-1; i++) {
            queue[i]=queue[i+1];
        }
        this.size--;
        return result;
    }

    T peek() throws QueueIsEmptyException  {
       if (size < 0) throw new  QueueIsEmptyException();
       return (T) queue[0];
    }
}

