package collection.tyss;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> set= new LinkedHashSet<Object>();
		set.add(40);
		set.add("hi");
		set.add("hello");
		set.add("hi");// duplicate notb allowed
		set.add(null);
		set.add(null);//null allows only 1 time
		System.out.println("Linked Hash Set having this value: "+set);
		System.out.println("====================================================");
		System.out.println("LinkedHash Set Size is : "+set.size());
		System.out.println("====================================================");
		System.out.println("LinkedHashset Having hi? : "+set.contains("hi"));
		System.out.println("====================================================");
		System.out.println("Removeing null from LinkedHashSet : "+set.remove(null));
		System.out.println("====================================================");
		System.out.println("After Removing null from LinkedHashSet : "+set);

	}

}
