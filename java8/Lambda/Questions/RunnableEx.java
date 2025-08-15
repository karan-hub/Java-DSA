package java8.Lambda.Questions;

public class RunnableEx {
    Runnable runnable = ()->System.out.print("hello java");

    public static void main(String[] args) {
        RunnableEx sortList = new RunnableEx();
        sortList.runnable.run();
    }
}
