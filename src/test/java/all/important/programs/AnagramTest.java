package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String word1 = sc.nextLine();
		System.out.println("Enter the second string: ");
		String word2 = sc.nextLine();

		if (!word1.isEmpty() && !word2.isEmpty()) {

			if (word1.length() == word2.length()) {

				String firstword = word1.toUpperCase();
				String secondword = word2.toUpperCase();

				char[] ch1 = firstword.toCharArray();
				Arrays.sort(ch1);

				char[] ch2 = secondword.toCharArray();
				Arrays.sort(ch2);

				if (Arrays.equals(ch1, ch2)) {
					System.out.println("Congrats!! Strings are Anagram");

				} else {
					System.out.println("Strings are not Anagram");
				}

			} else {
				System.out.println("Number of characters are not same for both words");
			}

		} else {
			System.out.println("Invalid Inputs. Inputs can not be empty!! ");
		}
	}

}

/*
 * Write a program to check a given string is anagram or not;
 * 
 * What is Anagram?
 * Ans: Two string will be anagram to each other, if and only if they contains same number of characters, 
 * order of characters doesn't matter. That is, if two strings are anagram to each other, then one string 
 * can be rearranged to form the other string. For Example: abc and cba are anagram.
 * 
 * Steps:
 * 	1) Setup a condition that input can not be empty.
 * 	2) Check the length of strings are same;
 * 	3) Convert both strings to uppercase/lower case and then convert them to character arrays;
 * 	4) Sort both arrays;
 * 	5) Compare both arrays characters are same or not. If same then Anagram.
 * */
