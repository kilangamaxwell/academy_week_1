package com.bptn.course.week1;

import java.util.Scanner;

public class ScanInput {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    String userName;
	    
	    // Ask the user to enter the username by printing "Enter Username" and read the input given by the user
	    // Fill in the code for the above part below
	    System.out.println("Enter Username: ");
	    userName = myObj.nextLine();

	    // Print the username   
	    System.out.println("Username is: " + userName); 

	}

}
