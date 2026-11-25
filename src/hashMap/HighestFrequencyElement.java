package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequencyElement {
	  public static void main(String[] args) {

	        HashMap<Integer, Integer> map = new HashMap<>();
	        int[] arr = {1, 2, 3, 2, 4, 2, 3};
	                         int maxfrequency = 0;
	        int result = 0;

	            for (int i = 0; i < arr.length; i++) {
	                int num = arr[i];
	                if (!map.containsKey(num)) {
	                    map.put(num, 1);
	                } else {
	                    map.put(num, map.get(num) + 1);
	                }
	            }
	                for(Map.Entry<Integer,Integer>entry : map.entrySet()){
	                if (entry.getValue() >maxfrequency) {
	                    maxfrequency =entry.getValue();
	                    result = entry.getKey();
	    }
	                    
	}
	        System.out.print(result);
	            }

}
