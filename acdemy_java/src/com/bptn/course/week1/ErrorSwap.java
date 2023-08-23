package com.bptn.course.week1;

public class ErrorSwap {

	public static void main(String[] args) {
		int h = 3;
	    int w = 5;
	    System.out.println(h);  //3
	    System.out.println(w);  //5
	    int z = h;
	    h = w;
	    w = z;
	    System.out.println(h);  //expected 5
	    System.out.println(w);  //expected 3

	}

}
