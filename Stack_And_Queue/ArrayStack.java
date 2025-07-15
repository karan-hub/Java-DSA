package Stack_And_Queue;

public class ArrayStack<T> {
    Object[]  stack ;
    final static int DEFAULT_VALUE = 5 ;
    int size = -1;
    public ArrayStack(int size){
        this.stack= new Object[size];
    }

    public ArrayStack(){
        this.stack= new Object[DEFAULT_VALUE];
    }

    public T top() throws NegativeIndexAccessException{
           if(this.size <0){
                throw  new NegativeIndexAccessException("No One Element" + size);
           }
        return (T) stack[size];
    }

    public  void push(T element) throws  StackOverflowException{
        if (size >= stack.length-1)
            throw  new  StackOverflowException("Stack is full. Cannot push: " + element);
        stack[++size]=element;
    }

    public T pop() throws  NegativeIndexAccessException{
        if(this.size <0){
            throw  new NegativeIndexAccessException("Stack is Empty" + size);
        }
        T val = (T) stack[size];
        stack[size--] = null;
        return val;
    }

    public  int size(){
        return  this.size+1;
    }

    public boolean isEmpty() {
        return size < 0;
    }

    public boolean isFull() {
        return size >= stack.length - 1;
    }

}
