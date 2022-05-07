package pkg1;

import java.util.Arrays;

public class SortIntArrayExample {

	public static void main(String[] args) {
		int [] a = new int[]{3,2,5,4,1};
        System.out.println("orignal array: ");
        for(int i=0;i<a.length;i++)
        	System.out.println(" "+a[i]);
        Arrays.sort(a);
        System.out.println("sorted int array :");
        for(int i=0;i<a.length;i++)
        	System.out.println(" "+a[i]);
        
	}

}
