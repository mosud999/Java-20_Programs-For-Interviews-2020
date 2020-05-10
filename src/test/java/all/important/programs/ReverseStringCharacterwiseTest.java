package all.important.programs;

public class ReverseStringCharacterwiseTest {
	public static void main(String[] args) {

		String word = "I AM KALAM";
		char[] ch = word.toCharArray();

		StringBuffer reverse = new StringBuffer();

		for (int i = ch.length - 1; i >= 0; i--) {
			reverse.append(ch[i]);
		}

		System.out.println(reverse);

	}

}

/*
 * Write a program to reverse String without using reverse method character wise;
 * 
 * 1) Convert string to characters;
 * 2) Create an object of StringBuffer as it has the append method where we can store the characters;
 * 3) Loop through from the last to first and store in StringBuffer;
 * 4) Print the reverse;
 */
