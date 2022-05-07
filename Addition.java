package pkg;
import java.util.ArrayList;

public class Addition {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		 list.add(10);
		 list.add("shape");
		 list.add("%");
		 list.add(50);
		 list.add("rectangle");
		 list.add(80);
		 list.add('#');
		 list.add(76);
		 
		 int sum=0;
		 for(Object k:list)
		 {
			 try {
				 sum = sum + Integer.parseInt(k.toString());  //imp
			 }catch(Exception e)
			 {
				 System.out.println(e);
			 }
		 }
		 System.out.println(sum);
	}

}
