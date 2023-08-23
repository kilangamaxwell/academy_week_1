package com.bptn.course.week1;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		num = scan.nextInt();
		
		if (num > 0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative")	;
		}
		scan.close();

	}

}
