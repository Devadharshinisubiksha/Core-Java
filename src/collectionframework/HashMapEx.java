package collectionframework;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		map.put(1, "red");
		map.put(2, "blue");
		map.put(3, "green");
		map.put(4, "yellow");
		System.out.println("element in my hashset:"+map);
		System.out.println("element in my hashset:"+map.size());
		
		if(!map.containsValue("blue")) {
		      
		      map.put(1,"blue");
		    }

		    System.out.println("Updated HashMap:\n" + map);


	}

}
