package hashMap;

import java.util.HashMap;

public class FirstRepeatingCharacter {
	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<>();
		String str = "programming";
		boolean status = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				status = true;
				System.out.print(ch);
				break;
			} else {
				map.put(ch, 1);
			}
		}
		if (!status) {
			System.out.print("No  repeating character");
		}
	}

}
