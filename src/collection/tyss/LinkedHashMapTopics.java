package collection.tyss;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapTopics {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
//		LinkedHashTable<Integer, Object> map= new LinkedHashtable<Integer, Object>();
//		map.put(null, 50);// not allowed
//		map.put(50, null);// not allowed
		map.put(10,"India");
		map.put(20, "USA");
		map.put(50,"hi");
		map.put(50,"hello");//duplicate key is not allowed
		map.put(60, 30);// duplicate value is allowed
		map.replace(10, "welcome");
		System.out.println("========================================================");
		System.out.println(map.size());
		System.out.println("========================================================");
		System.out.println(map.containsKey(50));
		System.out.println("========================================================");
		System.out.println("Check welcome value present in map or not : "+map.containsValue("welcome"));
		System.out.println("========================================================");
		System.out.println("Before removing key 50 : "+map);
		map.remove(50);
		System.out.println("========================================================");
		System.out.println("After removing key 50 : "+map);
		System.out.println("========================================================");
		for(Entry<Integer, Object> m: map.entrySet())//foreach loop to frtch object 1 by 1
		{
			System.out.println(m.getKey()+" -----> "+m.getValue());
		}

	}

}
