package com.java8;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed=200;
		Runnable r=(int s)->{
			System.out.println("running the speed of"+speed);
		};
		r.run(speed);
		
	}

}
