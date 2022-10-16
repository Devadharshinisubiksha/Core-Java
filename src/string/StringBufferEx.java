package string;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming";
		StringBuffer sb1=new StringBuffer("Java");
		StringBuffer sb2=new StringBuffer("Programm");
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb1);
		System.out.println("Capacity[Total # ofCharacters] "+sb1.capacity());
		sb1.append(str);

		System.out.println(sb1);
		System.out.println("Capacity[Total # ofCharacters] "+sb1.capacity());
	sb1.append(sb2);
	System.out.println(sb1);
	System.out.println("Capacity[Total # ofCharacters] "+sb1.capacity());
	System.out.println("Length is:"+sb1.length());
	sb1.reverse();
	System.out.println(sb1);
	System.out.println(sb1.toString());
	sb1.insert(3, 89.89F);
	System.out.println(sb1);
	sb1.delete(3, 9);
	System.out.println(sb1);

	}

}
