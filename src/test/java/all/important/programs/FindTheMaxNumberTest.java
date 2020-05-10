package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMaxNumberTest {
	public static void main(String[] args) {

		int[] numbers = { 100, 4, 6, 4, 7, 8, 9, 9, 0, 90000 };
		int min = numbers[0]; // or initially we can keep the first number is min int min = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] > numbers[j]) {
					min = numbers[j];
				}
				if (numbers[i] < numbers[j]) {
					min = numbers[i];
				}
			}
		}
		System.out.println("Min number is = " + min);
	}
}

/*
 * 1) Loop one will start from the first number 
 * 2) Loop two will start from the second number 
 * 3) check the condition if first first loop number is greater than second loop
 * 4) Keep the max value in max variable
 */