package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeStringTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String originalWord = sc.nextLine();
		String reverseWord = "";

		for (int i = originalWord.length() - 1; i >= 0; i--) {
			reverseWord += originalWord.charAt(i);
		}

		boolean palindrome = true;

		for (int i = 0; i < originalWord.length(); i++) {
			if (originalWord.charAt(i) != reverseWord.charAt(i)) {
				palindrome = false;
			}
		}
		if (palindrome) {
			System.out.println("The word \"" + originalWord + "\" is palindrome");
		} else {
			System.out.println("The word \"" + originalWord + "\" is not palindrome");
		}
	}

}

/*
 * The otherway we can do this is like below: for (int i = originalWord.length()
 * - 1; i >= 0; i--) { reverseWord += originalWord.charAt(i); }
 * 
 * if (originalWord.equals(reverseWord)) { System.out.println("palindrome"); }
 * else { System.err.println("not"); }
 * 
 */

/*
 * Write a program to check if a given number or string is palindrome or not?
 * 
 * What is Anagram? Ans: A palindrome is a word, number, phrase, or other
 * sequence of characters which reads the same backward as forward, such as
 * madam, racecar.
 * 
 * Steps for String: 1) Reverse the string and store the value into another
 * string; 2) Compare both strings characters are same or not. 3) If same then
 * palindrome otherwise not 4) Sort both arrays; 5) Compare both arrays
 * characters are same or not. If same then Anagram.
 * 
 * Steps for Number: 1) Set a temp value; 3) Follow this condition : Remainder =
 * Temp%10; 4) Sort both arrays; 5) Compare both arrays characters are same or
 * not. If same then Anagram.
 */
