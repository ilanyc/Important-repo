package collectiondemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
	LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		hm.put(10, "Ila");  
		hm.put(20, "Ritu"); 
		hm.put(30, "Wad"); 
		
		System.out.println(hm.get(20)); //for get value
		
		for(Map.Entry m : hm.entrySet()) {  //for all value search with key by loop
			 System.out.println(m.getKey() + " " + m.getValue());
			 
		 
	//Fetching key  
	    //System.out.println("Keys: "+hm.keySet()); 
			 
		       
		       //Fetching value 
	    //System.out.println("Values: "+hm.values()); 
			 
	    
	    
	       //Fetching key-value pair  
	    //System.out.println("Key-Value pairs: "+hm.entrySet());  
 
	    
	    
			 
		
		}	
}
}