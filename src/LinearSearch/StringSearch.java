package LinearSearch;

import java.util.Arrays;

public class StringSearch {
	public static void main(String[] args) {
		String str = "Shadha";
		char element = 'a';
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == element) {
				System.out.println("exists");
				break;
			}

		}

		System.out.println(Arrays.toString(str.toCharArray()));// to print the string as an array
	}

}
