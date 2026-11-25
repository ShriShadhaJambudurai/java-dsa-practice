package hashMap;

import java.util.HashMap;
import java.util.Map;

public class CompareArrayFrequencies {

	  public static void main(String[] args) {

	        HashMap<Integer, Integer> map = new HashMap<>();

	        int[] arr1 = {1, 2, 2, 3};
	        int[] arr2 = {1, 2, 3, 3};

	        boolean status = true;

	        if (arr1.length != arr2.length) {
	            status = false;
	        } else {
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
	                    map.put(num1, map.get(num1) - 1);
	                } else {
	                    status = false;
	                    break;
	                }
	            }

	            if (status) {
	                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	                    if (entry.getValue() != 0) {
	                        status = false;
	                        break;
	                    }
	                }
	            }
	        }
	        System.out.println(status);
	    }
}
