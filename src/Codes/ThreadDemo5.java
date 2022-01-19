import java.util.Random;

class ProdCons implements Runnable {

	int var = 0;

	public void run() {
		if (Thread.currentThread().getName().equals("Producer")) {
			produce();
		} else if (Thread.currentThread().getName().equals("Consumer")) {
			consume();
		}
	}

	public synchronized void produce() {
		for(int i = 0;i<4;i++) {
			if (var == 0) {
				Random random = new Random();
				var = random.nextInt(100);
				System.out.println("Produced value is --> " + var);
				notify(); // notify to the consumer
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					System.out.println("Producer is calling wait on the value of var ---> " + var);
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // Producer thread will halt it's execution
			}
		}
	}

	public synchronized void consume() {
		for(int i = 0;i<4;i++) {
			if (var != 0) {
				System.out.println("Consumed value is --> " + var);
				var = 0;
				notify(); // notify to the producer
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (var == 0) {
				try {
					System.out.println("Consumer is calling wait on the value of var ---> "  + var);
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

public class ThreadDemo5 {
	public static void main(String[] args) {
		ProdCons pc = new ProdCons();

		Thread producer = new Thread(pc, "Producer");
		Thread consumer = new Thread(pc, "Consumer");
		producer.setPriority(5);
		consumer.setPriority(5);
		producer.start();
		consumer.start();

		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
