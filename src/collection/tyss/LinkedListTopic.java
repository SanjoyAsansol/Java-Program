package collection.tyss;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> list= new LinkedList<Object>();
		list.add(10);
		list.add("hi");
		list.add("hi");
		list.add(null);
		list.add(null);
		list.add(30);
		list.add(40);
		if(list.contains("hi"))
		{
			System.out.println("Element is present");
		}
		else {
			System.out.println("Element is not present");
		}
		System.out.println("====================================================================");
		System.out.println("Before Removing hi from list : "+list);
		list.remove("hi");
		System.out.println("After Removing hi from list : "+list);
		System.out.println("====================================================================");
		System.out.println(list.indexOf(40));
		System.out.println("====================================================================");
		System.out.println("List first element : "+list.getFirst());
		System.out.println("====================================================================");
		System.out.println("List last element : "+list.getLast());
		System.out.println("====================================================================");
		System.out.println("List Size is : "+list.size());
		System.out.println("====================================================================");
		list.addFirst(5);
		System.out.println(list);
		System.out.println("====================================================================");
		Iterator<Object> it= list.iterator();
		while(it.hasNext())
		{
			Object element = it.next();
			System.out.println(element);
		}
		System.out.println("====================================================================");
		
	}

}
