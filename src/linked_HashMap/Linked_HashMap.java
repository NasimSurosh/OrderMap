package linked_HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Linked_HashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> months1 = new LinkedHashMap<>();
		
		months1.put(2, "Feb");
		months1.put(3, "March");
		months1.put(5, "May");
		System.out.println(months1);
		
		for (Map.Entry<Integer, String> map1 :months1.entrySet()) {
			System.out.println(map1.getKey() + " , " + map1.getValue());
		}
		System.out.println();
		
		TreeMap<Integer, String> months2 = new TreeMap<>();
		
		months2.put(3, "March");
		months2.put(4, "April");
		months2.put(1, "Jun");
		
		System.out.println(months2);
		
		for (Map.Entry<Integer, String> map2: months2.entrySet()) {
			System.out.println(map2.getKey()+ " , " + map2.getValue());
		}
		
 
	}

}
