package com.genericsMaximum;

import java.util.Scanner;

public class TestMaximum {
	public static void main(String[] args) {
		Maximum max = new Maximum();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int first = scan.nextInt();
		
		System.out.print("Enter Second Number: ");
		int second = scan.nextInt();
		
		System.out.print("Enter Third Number: ");
		int third = scan.nextInt();
		
		max.maxInt(first,second,third);
				
	}
}