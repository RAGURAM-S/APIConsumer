package com.java.api.usage;

import com.java.common.calculations.Addition;

public class AdditionDemo {

	public static void main(String[] args) {
		Addition a = new Addition();
		int sum = a.add(21, 21, 32);
		Addition addition = new Addition();
		int total = addition.add(21, 12);
		System.out.println("sum of 3 numbers " + sum);
		System.out.println("--*****--");
		System.out.println("sum of 2 numbers " + total);
	}

}
