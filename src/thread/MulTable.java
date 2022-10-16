package thread;
class Table
{
    synchronized static void printTable (int n)
    {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println (+n+"*"+i+"="+(n*i));
            try
            {
                Thread.sleep (400);
            } 
            catch (Exception e)
            {
            }
        }
    }
}

class MyThreads1 extends Thread
{
    public void run ()
    {
        Table.printTable (1);
    }
}
class MyThreads2 extends Thread
{
    public void run ()
    {
        Table.printTable (3);
    }
}
public class MulTable{
	public static void main(String[]args) {
		 MyThreads1 t1 = new MyThreads1 ();
	        MyThreads2 t2 = new MyThreads2 ();
	        t1.start();
	        t2.start();
	}
}
