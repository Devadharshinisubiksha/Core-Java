package thread;
class ExtendingThread implements  Runnable{

	public void run()
	{
		System.out.println("implementing the runnable interface,thread started running..");
	}
}

public class ThEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingThread t1=new ExtendingThread();
		Thread t2=new Thread(t1);
		t2.start();
	}

}
