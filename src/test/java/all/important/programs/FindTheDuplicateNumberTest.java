package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheDuplicateNumberTest {
	public static void main(String[] args) {

		int[] numbers = { 1, 4, 6, 4, 7, 8, 9, 9, 0, 0 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.println("Duplicate Numbers : " + numbers[j]);
				}
			}
		}

	}

}

/*
 * 1) Loop one will start from the first number
 * 2) Loop two will start from the second number
 * 3) check the condition if first loop number matches with second loop
 * 4) If yes then duplicate;
 */