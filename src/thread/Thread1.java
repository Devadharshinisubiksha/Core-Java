package thread;
class Thread1 extends Thread{
	  public void run() 
   { 
     try 
       { 
        for(int i=1;i<=10;i++) 
        { 
          Thread.sleep(5000);          
          System.out.println(i); 
        } 
        } 
       catch(InterruptedException e) 
           { 
             System.out.println("Exception..."+e); 
           } 
    } 
} 
 
class Number 
{ 
  public static void main(String [] args) 
   { 
     Number m1 = new Number(); 
     Thread thread = new Thread((Runnable) m1); 
     thread.start(); 
   } 
} 