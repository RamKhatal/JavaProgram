package pkg;

import java.util.ArrayList;
import java.util.Collections;


public class arrayList {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
           list.add(10);
           list.add(20);
           list.add(30); 
           list.add(80);
           System.out.println(list);
          //get size of list
		System.out.println(list.size());
		
		//using get
		System.out.println(list.get(1));
		
		
		 list.add(50);
		 System.out.println(list);
		
		//using isEmpty()
	    // System.out.println(list.isEmpty());

		
		//using clear()
		// list.clear();
		 
		 // using reverse
		 Collections.reverse(list);
		 System.out.println(list);
		 
		 
		 
		 ArrayList<String> list1 = new ArrayList<>();
		 list1.add("sharp");
		 list1.add("shape");
		 list1.add("shalok");
		 
		 
		 // using sort()
      
         Collections.sort(list1);
		 System.out.println(list1);
		

	}

}
