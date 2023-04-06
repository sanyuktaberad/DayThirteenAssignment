package com.bridgelabz;

public class FindMaximum {
	public static void Maximum() {
		String value1 = new String("Apple");
		String value2 = new String("Banana");
		String value3 = new String("Peach");
		
		int max1 = value1.compareTo(value2);
		int max2 = value2.compareTo(value3);
		int max3 = value3.compareTo(value1);
		
		if (max1 > 0) {
			System.out.println("The maximum value among the three strings is: " + value1);
		}
		else if (max2 > 0) {
			System.out.println("The maximum value among the three strings is: " + value2);
		}
		else if (max3 > 0) {
			System.out.println("The maximum value among the three strings is: " + value3);
		}
		else {
			System.out.println("All values are same.");
		}
	}
	
	public static void main(String[] args) {
		Maximum();
	}

}
