package Codes;

class ARunner implements Runnable
    {static int count = 0;
        public void run()
        {
            for(int i =0;i<20;i++)
            increment();
        }

        public static synchronized void increment()
        {
            count++;
        }
    }
    public class Threads1
    {
        public static void main(String[] args) {
           ARunner r = new ARunner();
            Thread t1 = new Thread(r);
            Thread t2 = new Thread(r);
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Result is --> "+r.count);
        }
    }

