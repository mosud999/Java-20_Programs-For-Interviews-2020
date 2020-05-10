package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class RecursioneExample {
	
		static void p(){  
		System.out.println("hello");  
		p();  
		}  
		  
		public static void main(String[] args) {  
		p();  
		}  
		}


/*
 * Recursion in Java:
 * Recursion in java is a process in which a method calls itself continuously. 
 * A method in java that calls itself is called recursive method.
 * 
 * It makes the code compact but complex to understand.
 * 
 * Syntax:
 * 
 * returntype methodname(){  
 * //code to be executed  
 * methodname();//calling same method  
 * }  
 */
