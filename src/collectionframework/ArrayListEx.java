package collectionframework;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("apple");
		al.add(0,"apricot");
		al.add("pineapple");
		System.out.println("list of elements:"+al);
		System.out.println("get value from list:"+al.get(1));
		System.out.println("set value from list:"+al.set(2,"apple"));
		
		Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		  

	}

}
