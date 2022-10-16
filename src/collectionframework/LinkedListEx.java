package collectionframework;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add("4204");
		ll.add(0,5604);
		ll.add(9650);
		ll.add(6504);
		System.out.println("list of elements:"+ll);
		System.out.println("get value from list:"+ll.get(1));
		System.out.println("set value from list:"+ll.set(2,"9650"));
		System.out.println(ll.remove(0));
		
		

	}

}
