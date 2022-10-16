package thread;
class RunnableThread implements Runnable{
	public void run()
	{
		System.out.println("implementing the runnable interface,thread started running..");
	}
}

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableThread t1=new RunnableThread();
		Thread t2=new Thread(t1);
		t2.start();
	}

}
