package hashMap;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int[] arr = { 3, 2, 4 };
		int target = 6;
		boolean status = false;
		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			int complement = target - num;
			if (map.containsKey(complement)) {
				System.out.println(complement + ", " + num);
				status = true;
			} else {
				map.put(num, i);
			}
		}
		if (!status) {
			System.out.println("No pair found");
		}
	}
}
