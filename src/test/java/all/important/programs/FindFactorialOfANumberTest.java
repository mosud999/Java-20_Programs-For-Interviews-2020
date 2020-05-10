package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindFactorialOfANumberTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial value: ");
		int num = sc.nextInt();
		int factorial = 1;
		
		for(int i=num; i>=1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial value of "+num+ " is: " +factorial);

	}
}

/*
 * Write a program to find the factorial value of a number;
 * 
 * In mathematics, the factorial of a non-negative integer n, denoted by n!, 
 * is the product of all positive integers less than or equal to n. 
 * For example, 5 ! = 5 × 4 × 3 × 2 × 1 = 120.
 * 
 * 1) For loop for decreasing from the given number to till 1;
 * 2) Set factorial value is initially 1;
 * 3) Set up Factorial = Factorial * i; Result is saving to factorial and then multiply with i's value;
 * 4) Print the factorial which has total value;
 * 
 */