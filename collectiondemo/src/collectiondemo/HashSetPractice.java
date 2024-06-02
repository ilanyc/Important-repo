package collectiondemo;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		
		HashSet<String>bookList = new HashSet<>();
		
		bookList.add("QA book"); //duplicated value supported
		bookList.add("QA Book");
		bookList.add("c++");
		bookList.add("Java");
		bookList.add("Python");
		bookList.add("Php");
		//System.out.println(bookList);
		
		
		bookList.remove("Php");
		bookList.clear();
		boolean empty = bookList.isEmpty();
		System.out.println("List is empty: " + empty);
		
		
	for(String book : bookList) {  //for loop
		System.out.println(book);
	}
	}

}
