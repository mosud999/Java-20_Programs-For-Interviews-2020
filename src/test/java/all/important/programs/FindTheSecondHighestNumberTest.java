package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheSecondHighestNumberTest {
	public static void main(String[] args) {

		int[] num = { 100, 4, 6, 4, 7, 8, 9, 9, 0, 90000 };

		int largest, secondLargest;

		if (num[0] > num[1]) {
			largest = num[0];
			secondLargest = num[1];
		} else {
			largest = num[1];
			secondLargest = num[0];
		}

		for (int i = 2; i < num.length; i++) {

			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];
			}

			if (num[i] < largest && num[i] > secondLargest) {
				secondLargest = num[i];
			}
		}

		System.out.println("Second Largest Number Is: " + secondLargest);
	}
}

/*
 * 1) Setup a condition to check max and second max from first 2 numbers;
 * 2) setup a loop to start comparing from index 2nd position
 * 3) check the condition if i's value is max then original max then assign values like max=i's value; secondmax=max;
 * 4) check i's values is less than max but greater than secondmax then assign i's value in the secondmax position;
 */