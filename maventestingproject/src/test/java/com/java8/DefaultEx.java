package com.java8;
interface message{
	default void say()
	{
		System.out.println("hello,this is default method");
	}
	void say1(String s);
}

public class DefaultEx implements message {
	public void say1(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultEx de=new DefaultEx();
		de.say();
		de.say1("hello, this is method");

	}

}
