package pkg1;

import java.util.Arrays;

public class ClassA {

	public static void main(String[] args) {
		// simple program of array
		
		//     int
		int []b=new int[3];
		b[0]=10;
		b[1]=20;
		b[2]=30;
       System.out.println(b[2]);
      // int k=b.length;          using b.length
       System.out.println(b.length);
       
       
       //       new keyword String
       
       String[]c= {"ram","sham","ganu","shubhu"};
       System.out.println(c[3]);
       System.out.println(c.length);
       System.out.println("============================");
       
       // using for loop
       for(int i=0;i<c.length;i++)
       {
    	   System.out.print(c[i] +" ");
    	  
       }
       System.out.println();
       System.out.println("==============================");
      
       // using Arrays.toString()
       
       System.out.println(Arrays.toString(c));
	}

}
