package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMinNumberTest2 {
	public static void main(String[] args) {

		int[] numbers = { 100, 4, 6, 4, 7, 8, 9, 9, 0, 90000 };
		int max = numbers[0]; // or initially we can keep the first number is max number like int max = a[0];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] > numbers[j]) {
					max = numbers[i];
				}
				if (numbers[i] < numbers[j]) {
					max = numbers[j];
				}
			}
		}
		System.out.println("Max number is = " +max);
	}
}

/*
 * 1) Loop one will start from the first number 
 * 2) Loop two will start from the second number 
 * 3) check the condition if first first loop number is greater than second loop
 * 4) Keep the max value in max variable
 */