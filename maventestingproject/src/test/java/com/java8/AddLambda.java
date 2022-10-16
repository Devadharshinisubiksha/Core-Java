package com.java8;
interface Addable{
	int add(int x,int y);
}
public class AddLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable a=(x,y)->(x+y);
		System.out.println(a.add(100, 25));
		

	}

}
