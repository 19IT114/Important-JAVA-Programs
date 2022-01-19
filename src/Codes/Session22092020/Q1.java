package Session22092020;

class Extension extends Thread
{
    Extension()
    {
        super("Virag");
    }
    public void run()
    {
        System.out.println("Hello World from "+Thread.currentThread().getName());
    }
}

class Implementation implements Runnable
{
    public void run()
    {
        System.out.println("Hello World From Runnable");
    }
}
public class Q1 {
    public static void main(String[] args) {
        Extension e  = new Extension();
//        Thread t = new Thread(e,"Virag");
        e.start();

        Implementation i = new Implementation();
        Thread t1 = new Thread(i);
        t1.start();
    }
}
