package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariableTest {
	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		a = a + b; // 5+10=15;
		b = a - b; // 15-10=5;
		a = a - b; // 15-5=10;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}

/*
 * Write a program to swap two numbers without using any third variable;
 */