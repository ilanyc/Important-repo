package collectiondemo;

import java.util.LinkedList;

public class LinklistExample {


	public static void main(String[] args) {
		
		LinkedList<String> studentList = new LinkedList<String>();
		studentList.add("Ila");
		studentList.add("Ritu");
		studentList.add("Sumi");
		studentList.add("Waiz");
		studentList.add(4, "Iva");
		
		//System.out.println(studentList);
		
		studentList.addFirst("Wateen");
		studentList.addLast("Wad");
		
		studentList.remove("Sumi");//for remove
		studentList.remove(2); //for remove index
		
		for(String names: studentList) {  //for each loop
			System.out.println(names);
		}
		
		System.out.println("First element: " + studentList.getFirst());
		System.out.println("Size:" + studentList.size());
	}

}
