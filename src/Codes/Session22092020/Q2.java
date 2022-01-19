package Session22092020;


class Add implements Runnable
{ static int sum=0,i=0;
    synchronized public void run()
    {
        for(;i<=100;i++)
        {
            {
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sum += i;
                System.out.println(Thread.currentThread().getName() + "  " + i + "  " + sum);
            }
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        Add a = new Add();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        Thread t3 = new Thread(a);
        Thread t4 = new Thread(a);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            System.out.println("Sum is " + a.sum);


    }
}
