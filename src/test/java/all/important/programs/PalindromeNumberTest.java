package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeNumberTest {
	public static void main(String[] args) {

		int remainder = 0;
		int reverseNumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int originalNumber = sc.nextInt();
		int temp = originalNumber;

		while (temp != 0) {

			remainder = temp % 10; // get the remainder; ex: 3;
			reverseNumber = reverseNumber * 10 + remainder; // keep it in reverse variable;
			temp = temp / 10; // get the number after the remainder;
		}

		if (originalNumber == reverseNumber) {
			System.out.println("Then number \"" + originalNumber + "\" is Palindrome");
		} else {
			System.out.println("Then number \"" + originalNumber + "\" is Not Palindrome");
		}

	}

}

/*
 * Write a program to check if a given number is palindrome or not?
 * 
 * What is Palindrome? Ans: A palindrome is a word, number, phrase, or other
 * sequence of characters which reads the same backward as forward, such as
 * madam, racecar.
 * 
 * There are 3 steps for it; 1) take the remainder; 2) keep it in reverse
 * variable; 3) divided by 10 which will remove the remainder from the number;
 */
