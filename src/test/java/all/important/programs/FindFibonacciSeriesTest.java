package all.important.programs;

public class FindFibonacciSeriesTest {
	
	public static void main(String[] args) {

		int previous = 0;
		int next = 1;
		int sum=0;

		for(int i=2; sum<=100; i++) {
			System.out.print(" " + sum + " ");
			sum = previous + next;
			previous = next;
			next = sum;
		}
		
		/*
		// Print fibonacci numbers till 100;
		while(previous<=100) {
			
			System.out.print(" " + previous + " ");
			sum = previous + next;
			previous = next;
			next = sum;
		}
		
		for(int i=2; previous<=100; i++) {
			System.out.print(" " + previous + " ");
			sum = previous + next;
			previous = next;
			next = sum;
		}
		
		/*

/*	// to print first 10 fibonacci numbers;	
 * for (int i = 2; i <=10; i++) {
			sum = previous + next;
			previous = next;
			next = sum;

			System.out.print(" " + sum + " ");
		}*/

	}

}

/*
 * Write a program to find the fibonacci series from 1 to 100;
 * 
 * Fibonacci Sequence. The Fibonacci Sequence is the series 
 * of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
 * The next number is found by adding up the two numbers before it.
 * 
 * Important: if you want to print 10 fibonacci numbers then go with i's value but
 * if you want to print till 100 then instead of i's condition put sum<=100;
 * 
 */
