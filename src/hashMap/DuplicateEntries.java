package hashMap;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEntries {
	 public static void main(String[] args) {
		 int[] arr = {4, 2, 7, 2, 4, 8, 9};
		 HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i =0;i<arr.length;i++){
	             int num = arr[i];
	             if (!map.containsKey(num)) {
	            	    map.put(num, 1);
	            	} else if (map.get(num) == 1) {
	            	    System.out.println("duplicate is " + num);
	            	    map.put(num, map.get(num) + 1);
	            	} else {
	            	    map.put(num, map.get(num) + 1);
	            	}
	            
	        }
	        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
                System.out.println(entry.getKey() + "->" +entry.getValue());
            }
       
	 }

}
