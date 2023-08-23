package com.bptn.course.week1;

import java.util.Scanner;

public class UserInfo {
	
	private static String favCity;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter your name:");

	    // String input
	    String name = scanner.nextLine();

	    System.out.println("Enter your favorite city: ");

	    // string input initializing variable that previously declared
	    favCity = scanner.nextLine();

	    System.out.println("Enter your age: ");

	    // Numerical input - integer
	    int age = scanner.nextInt();

	    System.out.println("Enter your salary: ");

	    // numeric input - double
	    double salary = scanner.nextDouble();

	    // Output input by user
	    System.out.println("\nPrinting Your Answers......."); 
	    System.out.println("Name: " + name); 
	    System.out.println("Favorite city: " + getFavCity());
	    System.out.println("Age: " + age); 
	    System.out.println("Salary: " + salary);

	    scanner.close();
	  }

	  private static String getFavCity(){
	      return favCity;
	  }

	

}
