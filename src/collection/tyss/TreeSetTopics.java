package collection.tyss;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> set= new TreeSet<Object>();
		set.add(50);
		set.add(40);
		set.add(10);
		set.add(60);
		System.out.println(set);
		System.out.println("====================================================");
		System.out.println("Arrange in Decending Order"+set.descendingSet());
		System.out.println("====================================================");
		System.out.println("First value is : "+set.first());// first object
		System.out.println("====================================================");
		System.out.println("Last Value is  : "+set.last()); // last object
		System.out.println("====================================================");
		System.out.println("Value higher of 40 is : "+set.higher(40));// after 40 - 50
		System.out.println("====================================================");
		System.out.println("Value lower of 40 is : "+set.lower(40)); //before 40 - 10
		System.out.println("====================================================");
		System.out.println("object before 50 : "+set.headSet(50));//Object before 50 (10,40)
		System.out.println("====================================================");
		System.out.println("object after 40 : "+set.tailSet(40));// object after 40 (40,50,60)
		System.out.println("====================================================");
		System.out.println("Object Between 10 and 60 is : "+set.subSet(10, 60));// Object Between 10 to 60
		
	}

}
