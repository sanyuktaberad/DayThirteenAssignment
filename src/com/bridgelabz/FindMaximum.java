package com.bridgelabz;

public class FindMaximum {
	public static void Maximum() {
		Integer num1 = new Integer("500");
		Integer num2 = new Integer("600");
		Integer num3 = new Integer("800");
		
		int max1 = num1.compareTo(num2);
		int max2 = num2.compareTo(num3);
		int max3 = num3.compareTo(num1);
		
		if (max1 > 0) {
			System.out.println("The maximum value among the three numbers is: " + num1);
		}
		else if (max2 > 0) {
			System.out.println("The maximum value among the three numbers is: " + num2);
		}
		else if (max3 > 0) {
			System.out.println("The maximum value among the three numbers is: " + num3);
		}
		else {
			System.out.println("All values are same.");
		}
	}
	
	public static void main(String[] args) {
		Maximum();
	}

}
