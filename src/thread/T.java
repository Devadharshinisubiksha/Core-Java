package thread;
public class T{
	public static void main(String[] args) {
		MultiThraed thread1 = new MultiThraed("Thread1");
		thread1.start();
		MultiThraed thread2 = new MultiThraed("Thread2");
		thread2.start();
		}
	}
class MultiThraed implements Runnable {
	Thread Cooking;
	private String IoT;
	MultiThraed(String name) {
		IoT = name;
}
	@Override
public void run() 
	{
		System.out.println("Thread running" + IoT);
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
			System.out.println(IoT);
			try
			{
				Thread.sleep(1000);
				} 
			catch (InterruptedException e)
			{
				System.out.println("Thread is interrupted");
				}
			}
		}
	public void start() {
		System.out.println("Thread started");
		if (Cooking == null) {
			Cooking = new Thread(this, IoT);
			Cooking.start();
			}
		}
	}
 
