package collectiondemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

   public static void main(String[] args) {

	 TreeSet<String> set = new TreeSet<String>();

		set.add("Ila");
		set.add("Ritu");
		set.add("Iva");

		System.out.println("They are QA Students");

		Iterator i = set.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			

		}
	}
}