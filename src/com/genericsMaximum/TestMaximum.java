package com.genericsMaximum;

import java.util.Scanner;

public class TestMaximum {
	public static void main(String[] args) {
		Maximum max = new Maximum();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter First Value: ");
		float first = scan.nextFloat();
		
		System.out.print("Enter Second Value: ");
		float second = scan.nextFloat();
		
		System.out.print("Enter Third Value: ");
		float third = scan.nextFloat();
		
		max.maxFloat(first,second,third);
				
	}
}