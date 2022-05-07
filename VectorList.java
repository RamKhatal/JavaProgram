package pkg;

import java.util.ListIterator;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args)
	{
	Vector<Object> list = new Vector<>();
	list.add('@');
	list.add('#');
	list.add('%');
	list.add('&');
	list.add('*');
	ListIterator lItr = list.listIterator();
	   while(lItr.hasNext()); 
	   {
		System.out.println(lItr.next());
	   }
	   
	   System.out.println("============");
	   while(lItr.hasPrevious())
	   {
		   System.out.println(lItr.previous());
	   }
	
	   }


}
