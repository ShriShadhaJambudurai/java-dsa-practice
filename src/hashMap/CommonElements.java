package hashMap;

import java.util.HashMap;

public class CommonElements {
	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7, 3 };
		for (int i = 0; i < arr1.length; i++) {
			int num = arr1[i];
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num) + 1);
			}
		}
		for (int j = 0; j < arr2.length; j++) {
			int num1 = arr2[j];
			if (map.containsKey(num1) && map.get(num1) > 0) {
				map.put(num1, 0);
				System.out.println(num1);
			}
		}
	}

}
