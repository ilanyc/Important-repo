package collectiondemo;

import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		
     ArrayList<Integer>number = new ArrayList<Integer>();
		
		number.add(5);
		number.add(10);
		number.add(15);
		number.add(3, 20);
		
		System.out.println("before remove " + number);	
	    System.out.println("size = " + number.size());	
	    
  boolean index = number.contains(25);
	  System.out.println("Index has contain " + index);
	  
	  int n = number.indexOf(10);
      System.out.println(n);
      
      
     number.set(1,30) ;
      System.out.println(number);
	}
	

}
