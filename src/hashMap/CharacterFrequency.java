package hashMap;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<>();
		String str = "programming";
		boolean status = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}

	}

}
