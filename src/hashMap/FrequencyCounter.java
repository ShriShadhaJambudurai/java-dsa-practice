package hashMap;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 3, 1, 2};
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i =0;i<arr.length;i++){
	             int num = arr[i];
	            if(map.containsKey(num)){
	                 map.put(num, map.get(num) + 1);
	            }else{
	                  map.put(num, 1);
	            }
	            
	        }
	        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
	                 System.out.println(entry.getKey() + "->" +entry.getValue());
	             }
	        }

}
