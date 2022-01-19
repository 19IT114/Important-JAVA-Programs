package practice;

import java.util.function.Consumer;

public class threads implements Runnable
{
    boolean produced,consumed;
    int P=0;
    @Override
   public void run() {
        if(Thread.currentThread().getName().equals("Producer"))
            Producer();
        else if(Thread.currentThread().getName().equals("Consumer"))
            Customer();
    }

   synchronized public void Producer()
    {
      for(int i=0;i<10;i++){
          if(P<=1) {
              System.out.println("Producer has Produced Apple");
              P++;
              notify();
              try {
                  Thread.currentThread().sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
          else
          {
              try {
                  wait();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }

      }
    }
   synchronized public void Customer() {
        for(int i=0;i<10;i++){
            if (P>0) {
                System.out.println("Consumer has consumed Apple");
                P--;
                notify();
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else
                {
                System.out.println("Consumer has to wait");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            }
        }



    public static void main(String[] args) {
        threads t = new threads();
        Thread t1 = new Thread(t,"Producer");
        Thread t2 = new Thread(t,"Consumer");

        t1.start();
        t2.start();


        try{
            t1.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}