package collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101, "Ila");//put method for hashMap
		hm.put(102, "Iva");
		hm.put(103, "Wad");
		hm.put(104, "Waiz");
		
		//System.out.println(hm.get(101));//for one value
		
	for(Map.Entry m : hm.entrySet()) {  //for all value search with key
	 System.out.println(m.getKey() + " " + m.getValue());
	 
	}
	}

}
