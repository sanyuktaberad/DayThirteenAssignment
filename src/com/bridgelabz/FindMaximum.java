package com.bridgelabz;

public class FindMaximum {
	public static void Maximum() {
		Float value1 = new Float("0.55");
		Float value2 = new Float("3.55");
		Float value3 = new Float("6.89");;
		
		float max1 = value1.compareTo(value2);
		float max2 = value2.compareTo(value3);
		float max3 = value3.compareTo(value1);
		
		if (max1 > 0) {
			System.out.println("The maximum value among the three numbers is: " + value1);
		}
		else if (max2 > 0) {
			System.out.println("The maximum value among the three numbers is: " + value2);
		}
		else if (max3 > 0) {
			System.out.println("The maximum value among the three numbers is: " + value3);
		}
		else {
			System.out.println("All values are same.");
		}
	}
	
	public static void main(String[] args) {
		Maximum();
	}

}
