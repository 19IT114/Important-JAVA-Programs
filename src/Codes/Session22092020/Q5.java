package Session22092020;
class Sync extends Thread
{ static int sum = 0;
    int i =0 ;
    public void run()
    {
        for(i=0;i<=100;Sum())
        {
            sum += i;

        }
//        for(i=0;i<100;getsum())
//        {
//            sum1 += i;
//        }
    }

    public synchronized void Sum() {
        i++;
    }
//    public void getsum()
//    {
//        i++;
//    }
}
public class Q5 {
    public static void main(String[] args) {
        Sync s = new Sync();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of Syncronized method  = "+s.sum);
//        System.out.println("Sum of normal method  = "+s.sum1);
    }
}
