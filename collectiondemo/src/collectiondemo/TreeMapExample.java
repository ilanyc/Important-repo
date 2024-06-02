package collectiondemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();

	    map.put(10,"Ritu");
		map.put(20,"Iva");
		map.put(30,"Ila");
		
		   for(Map.Entry m: map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());   
		       
	}

}
}