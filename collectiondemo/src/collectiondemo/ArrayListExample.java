package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {

	public static void main(String[] args) {
		
	ArrayList<Integer>number = new ArrayList<Integer>();//no size
		
     //System.out.println("size = " + number.size());
		
	//adding elements
		number.add(5);
		number.add(10);
		number.add(15);
		number.add(3, 20);//if which index will be add
		
	//System.out.println(number);	
    //System.out.println("size = " + number.size());//after adding size	
    
		
		
   for(int arr : number) { //for each loop
    	System.out.println("size = " + arr);
		
    	
		//Iterator itr = number.iterator();
		//while(itr.hasNext()) {
			//System.out.println("Size : " + itr.next());// for while loop
			
    }	
    
    }

	
		
}


