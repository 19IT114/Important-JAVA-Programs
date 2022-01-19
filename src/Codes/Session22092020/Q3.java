package Session22092020;

class Increment extends Thread
{
    int i = 0;
    public void run()
    {

        try {
            System.out.println("Original value = "+i);
            Thread.currentThread().sleep(1000);
            System.out.println("Value after increment = " + (++i));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        Increment in = new Increment();
        Thread t = new Thread(in);
        t.start();
    }
}
