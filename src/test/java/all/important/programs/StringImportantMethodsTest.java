package all.important.programs;

import java.util.Arrays;
import java.util.Scanner;

public class StringImportantMethodsTest {
	public static void main(String[] args) {
		
		String s = "Hello World";
		
		// Get the length of a String;
		int length = s.length();
		System.out.println("Length of String = " + length);
		
		// To get the specific character of an index;
		char ch = s.charAt(0);
		System.out.println("Charcter at index 0 = " + ch);
		
		// Connect two strings;
		String s2 = s.concat(" I am here");
		System.out.println("Concatanation of two String = " + s2);
		
		// Replace character and strings;
		String replaceCharacters = s.replace('H', 'M'); // Characterwise replacement;
		System.out.println("Charcaterwise replacement = " + replaceCharacters);
		
		String replaceStrings = s.replace("Hello", "Mello");
		System.out.println("Replace String Words = " + replaceStrings);
		
		// SubString methods;
		String beginIndex = s.substring(3); //One parameter int beginIndex;
		System.out.println("Substring Begin Index = " + beginIndex);
		
		String beginAndEndIndexes = s.substring(3, 7); //Two parameters int beginIndex - int endIndex;
		System.out.println("Substring Begin to End Indexes = " + beginAndEndIndexes);
		
		// Remove space from front and back of a string;
		String trimString = " hello ".trim();
		System.out.println("Remove Spaces Using Trim: = " + trimString);
		
		// String to character array conversion;
		char[] ch3 = "Hello".toCharArray();
		for(char mainCh: ch3) {
			System.out.println("Character Strings Are: " + mainCh);
		}
		
		// Splitting Strings and makes them array of strings;
		String[] s4 = "Hello I Am Here".split(" ");
		for(String mainS: s4) {
			System.out.println(s4);
		}
		
		// To check if a String is empty or not;
		boolean a = s.isEmpty();
		System.out.println("String isEmpty method: " +a);
		
		// Get the index numbers of a string 
		s.indexOf('c');
		s.indexOf("word");
		
		// Compare between two strings and will return true or false;
		s.compareTo("hello");
		
	}

}

/*
 * Important String Methods;
 */
