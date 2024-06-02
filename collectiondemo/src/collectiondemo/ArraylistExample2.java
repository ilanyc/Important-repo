package collectiondemo;

import java.util.ArrayList;

public class ArraylistExample2 {

	public static void main(String[] args) {
		
	ArrayList<Integer>number = new ArrayList<Integer>();
		
		number.add(5);
		number.add(10);
		number.add(15);
		number.add(3, 20);
		
		System.out.println("before remove " + number);	
	    System.out.println("size = " + number.size());	
		
		number.remove(0);
		number.clear(); //if 
		System.out.println("After remove " + number);
		System.out.println("size = " + number.size());	
		
		boolean b = number.isEmpty(); //for check empty
	    System.out.println(b);
		
	}

}
