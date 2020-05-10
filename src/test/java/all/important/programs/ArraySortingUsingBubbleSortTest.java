package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingUsingBubbleSortTest {
	public static void main(String[] args) {

		int[] a = { 1, 3, 2, 5, 1, 9 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i]; // Store a[i] value in temp for swapping and assign into a[j];
					a[i] = a[j]; // Assigning a[i] original value to a[j] means swapping
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted array value : ");
		for (int x : a) {

			System.out.println(x);
		}
	}

}

/*
 * Write a program to sort an array without using array sort method; We will use bubble sort;
 * 
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the largest number for left to right;
 * 4,1,2,5,6
 *  1,4,2,5,6
 *  	1, 2, 4, 5, 6 
 * */
