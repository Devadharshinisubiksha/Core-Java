package ConstructorEx;

public class Example {
	 Example(int i, int j){
	      System.out.print("parameterized constructor");
	   }
	   Example(int i, int j, int k){
	      System.out.print("parameterized constructor1");
	   }
	   public static void main(String args[]){
	      Example obj = new Example(4,5,5);

}
	   }



