package Session22092020;
class ThreadDemo extends Thread
{
    public void run()
    {
        if(Thread.currentThread().getName().equals("FIRST"))
            System.out.println("Calling from FIRST thread");
        if(Thread.currentThread().getName().equals("SECOND"))
            System.out.println("Calling from SECOND thread");
        if(Thread.currentThread().getName().equals("THIRD"))
            System.out.println("Calling from THIRD thread");
    }
}
public class Q4 {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        Thread FIRST = new Thread(td,"FIRST");
        Thread SECOND = new Thread(td,"SECOND");
        Thread THIRD = new Thread(td,"THIRD");
        FIRST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);
        FIRST.start();
        SECOND.start();
        THIRD.start();
    }
}
