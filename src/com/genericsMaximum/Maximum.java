package com.genericsMaximum;

public class Maximum {
	public void maxFloat(Float first,Float second,Float third) {
		if(first.compareTo(second) >=0 && first.compareTo(third) >=0) {
			System.out.println("First Element is Largest");
		}else if(second.compareTo(first) >= 0 && third.compareTo(third) >=0) {
			System.out.println("Second Element is Largest");
		}else {
			System.out.println("Third Element is Largest");
		}
	}
}