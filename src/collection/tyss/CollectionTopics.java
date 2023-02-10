package collection.tyss;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add("hi");
		list.add("hi");
		list.add(null);
		list.add(null);
		list.add(30);
		list.add(40);
		System.out.println(list);
		ArrayList<Integer> list1= new ArrayList<Integer>();
		list1.add(40);
		list1.add(4);
		list1.add(30);
		list1.add(10);
		list1.add(60);
		Collections.sort(list1);//sort in assecding order
		System.out.println(list1);
		list.addAll(list1);// add list1 to list
		System.out.println(list);
		//check the oblect is present or not
		if(list.contains("hi"))
		{
			System.out.println("Object is present");
		}
		else
		{
			System.out.println("Object is not present");
		}
		//fetch element 1 by 1
		for(Object Obj:list)
		{
			System.out.println(Obj);
		}
		list.add(3,"hello");// add object to index 3
		list.remove(4); //remove element from index no 4
		System.out.println(list);
		System.out.println(list.get(5));//get te object present in index no 5
		list.remove("30");
		//System.out.println(list.remove("30")); // remove the object 30 from the list
		System.out.println(list);
		System.out.println(list.set(6, "bye"));//add object bye to index 6
		System.out.println(list);
		System.out.println(list.size()); // fetch the sizeof the list
		}

}
