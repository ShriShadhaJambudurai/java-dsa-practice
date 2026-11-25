package hashMap;

import java.util.HashMap;

public class FirstNonRepeatingElement {
	  public static void main(String[] args) {

	        HashMap<Integer, Integer> map = new HashMap<>();
	        int[] arr = {4, 5, 1, 2, 1, 4, 5};

	        boolean status = false;
	            for (int i = 0; i < arr.length; i++) {
	                int num = arr[i];

	                if (!map.containsKey(num)) {
	                    map.put(num, 1);
	                } else {
	                    map.put(num, map.get(num) + 1);
	                }
	            }
	                for (int i = 0; i < arr.length; i++) {
	    int num = arr[i];

	    if (map.get(num) == 1) {
	        System.out.println(num);
	        break;
	    }
	}
	            }

}
