package collectiondemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
    LinkedHashSet<String>bookList = new LinkedHashSet<>();
		
		bookList.add("QA Book");
		bookList.add("c++");
		bookList.add("Java");
		bookList.add("Python");
		bookList.add("Php");
	System.out.println(bookList);
	

	//bookList.remove("Php");
	//bookList.clear();
	//boolean empty = bookList.isEmpty();
	//System.out.println("List is empty: " + empty);
	
	
	//for(String book : bookList) {  //for loop
		//System.out.println(book);
	//}
	
	Iterator<String> itr= bookList.iterator();  //while loop
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
		
        
	}

}
}