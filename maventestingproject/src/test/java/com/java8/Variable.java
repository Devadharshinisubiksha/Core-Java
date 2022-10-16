package com.java8;
import java.util.*;

import java.util.Arrays;

public class Variable {
	private static int var=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>intSeq = (List) Arrays.asList(1,2,3);
		((Iterable<Integer>) intSeq).forEach(x -> System.out.println(x+var));
		intSeq.forEach(x -> {
			int y = x * 2;
			System.out.println(y);	
	});
	}
		

	}





 