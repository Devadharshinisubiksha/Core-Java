package hybridinheritanceEx;

interface Physics
{
 public void Physics();
}

interface Chemistry extends Physics
{
 public void Chemistry();
}

interface Botany extends Physics
{
 public void Botany();
}


   public class Laboratory implements Chemistry, Botany {
       public void Physics()
        {
          System.out.println("Physics Lab");
        }
       
    public void Chemistry()
    {
    	System.out.println("Chemistry Lab");
    	}
    
    public void Botany()
    {
    	System.out.println("Botany Lab");
    	}
    
public static void main(String[] args) {
	Laboratory l1= new Laboratory();
	l1.Physics();
	l1.Chemistry();
	l1.Botany();
	}
}