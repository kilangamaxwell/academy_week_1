package com.bptn.course.week1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		// Initialize the Scanner Object
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		
		
		// Fetch the input from the user and store in the variable called n
		int n = scanner.nextInt();
		
		int first = 0; 		// First element of Fibonacci series
		int second = 1;		// Second element of Fibonacci series
		
		System.out.print("Fibonacci Series up to " + n + " elements: ");

		// Print the first n numbers of the Fibonacci series:
		
		if (n == 1) {
			System.out.print(first);
		}
		else if (n == 2) {
			System.out.print(first + ", " + second);
		}
		else if (n > 2) {
			int next = first + second;
			
			System.out.print(first + ", " + second + ", " + next);
			
			for (int i = 3; i < n; i++) {
				first = second;
				second = next;
				next = first + second;
				
				System.out.print(", " + next);
			}
		}
		scanner.close();
	}

}
