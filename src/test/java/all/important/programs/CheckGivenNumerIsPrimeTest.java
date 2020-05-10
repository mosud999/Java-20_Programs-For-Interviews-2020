package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class CheckGivenNumerIsPrimeTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int num = sc.nextInt();
		int counter = 0;

		for (int i = num; i >= 1; i--) {
			if (num % i == 0) {
				counter = counter + 1;
			}
		}

		if (counter == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}

/*
 * Write a program to check if a specific number is prime or not;
 * 
 * Prime number means which is only deviseable by his own and 1. Means there will be no remainder in this two time;
 *  Note: Only two times remainder found 0; when any number is divided by that number and number 1;
 * 1) For loop to start from that number and decrease till 1;
 * 2) Condition to check if remainder gets 0 two times or not. If yes then counter = counter +1;
 * 3) If counter == 2 means remainder is found 0 two times which means this is a prime number;
 */