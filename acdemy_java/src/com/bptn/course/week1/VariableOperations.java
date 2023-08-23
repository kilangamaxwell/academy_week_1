package com.bptn.course.week1;

public class VariableOperations {

	public static void main(String[] args) {
		int x = 17;
		int y = 23;
		
		int z = x + y;
		int i = x - y;
		int m = x * y;
		double d = (double)x / y;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("x + y: " + z);
		System.out.println("x - y: " + i);
		System.out.println("x * y: " + m);
		System.out.println("x / y: " + d);
		
		x = 10;
		y = 20;
		z = x + y;
		i = x - y;
		m = x * y;
		d = (double)x / y;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("x + y: " + z);
		System.out.println("x - y: " + i);
		System.out.println("x * y: " + m);
		System.out.println("x / y: " + d);
		
		char midInitial = 'R';
		String midName = "Robert";
		
		System.out.println("Middle Initial: " + midInitial);
		System.out.println("Middle Name: " + midName);

	}

}
