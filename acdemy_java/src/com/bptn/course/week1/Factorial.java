package com.bptn.course.week1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		// Fill in the code below
		Scanner numEntry = new Scanner(System.in);
		
		System.out.print("Input = ");
		
		int factorial = numEntry.nextInt();
		int product = factorial;
		
		while (factorial > 1) {
			factorial--;
			product *= factorial;
		}
		System.out.println("Output = " + product);
		numEntry.close();

	}

}
