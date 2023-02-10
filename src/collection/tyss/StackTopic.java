package collection.tyss;

import java.util.Stack;

public class StackTopic {
	public static void main(String[] args) {
		
	Stack<Object> s= new Stack<Object>();
	s.push(10);
	s.push(20);
	System.out.println(s.pop());//20
	System.out.println(s.pop()); //10
	}

}
