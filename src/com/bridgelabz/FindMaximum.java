package com.bridgelabz;

public class FindMaximum {

	public static <A extends Comparable<A>> A maximum(A x, A y, A z) {
		A max = x;

		if (y.compareTo(max) > 0) {
			max = y;
		}

		if (z.compareTo(max) > 0) {
			max = z;
		}

		return max;
	}

	public static void main(String[] args) {
		System.out.println("Maximum number among the three numbers is: " + maximum(1, 7, 3));
		System.out.println(" ");

		System.out.println("Maximum value among the three float values is: "+ maximum(2.7,6.98,11.55));
		System.out.println(" ");
		
		System.out.println("Maximum value among the three string values is: "+ maximum("Apple", "Banana", "Peach"));
	}
}
