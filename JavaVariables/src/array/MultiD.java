package array;

public class MultiD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[10];
		int arr2[][]=new int[4][3];
		
		System.out.println(Integer.SIZE/8);
		System.out.println("arr1:"+(arr1.length));
		System.out.println("arr2:"+(arr2.length));
		System.out.println("arr2 total locations:"+(arr2.length)*3);
		System.out.println("\narr1 total size:"+(arr1.length)*(Integer.SIZE/8));
		System.out.println("\narr2 total size:"+(arr2.length)*3*(Integer.SIZE/8));
		

	}

}
