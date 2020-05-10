package all.important.programs;

public class ReverseStringWordwiseTest {
	public static void main(String[] args) {

		String word = "I AM KALAM";
		String[] words = word.split(" ");

		StringBuffer reverseWords = new StringBuffer();

		for (int i = words.length - 1; i >= 0; i--) {
			reverseWords.append(words[i]).append(" ");
		}
		String reverse = reverseWords.toString().trim();
		System.out.println(reverse);

	}

}

/*
 * Write a program to reverse String without using reverse method;
 * 
 * 1) Splits the words based on spaces;
 * 2) Create an object of StringBuffer as it has the append method where we cam store the words;
 * 3) Loop through from the last to first and store in StringBuffer;
 * 4) Convert to string and user trim method to remove extra space from front and back;
 */
