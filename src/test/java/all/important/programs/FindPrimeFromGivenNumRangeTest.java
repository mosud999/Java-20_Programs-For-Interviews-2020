package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindPrimeFromGivenNumRangeTest {
	public static void main(String[] args) {

		String primeNumbers = "";
		
		for (int i = 1; i <= 100; i++) {
			
			int counter = 0;
			
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter = counter + 1;
				}
			}

			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime Numbers Are: ");
		System.out.println(primeNumbers);
	}
}

/*
 * Write a program to find all prime numbers between the range 1 to 100;
 * 
 * Prime number means which is only deviseable by his own and 1. Means there will be no remainder in this two time;
 *
 * Note: Only two times remainder found 0; when any number is divided by that number and number 1;
 * 
 * 1) For loop to start from 1 to 100;
 * 2) Another for loop to get reverse from i to check if it devisable by the previous numbers or not?
 * 3) If counter == 2 means means it is divided by that number and and number 1 when remainder is 0 found two times.
 */