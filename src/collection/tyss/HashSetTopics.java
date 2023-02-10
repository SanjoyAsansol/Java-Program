package collection.tyss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> set= new HashSet<Object>();
		set.add(40);
		set.add("hi");
		set.add("hello");
		set.add("hi");// duplicate notb allowed
		set.add(null);
		set.add(null);//null allows only 1 time
		System.out.println("Set having this value: "+set);
		System.out.println("===============================================");
		System.out.println("Set size is : "+set.size());
		System.out.println("===============================================");
		System.out.println("set having hello ?? "+set.contains("hello"));
		System.out.println("===============================================");
		System.out.println("Set is empty or not? "+set.isEmpty());
		System.out.println("===============================================");
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(7);
		list.add("bye");
		list.add(7);
		list.add(null);
		System.out.println("List Size is : "+list.size());
		System.out.println("===============================================");
		System.out.println(list);
		System.out.println("===============================================");
		System.out.println("=================== Iterating the list and get one by one ===============");
		Iterator<Object> it= list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
