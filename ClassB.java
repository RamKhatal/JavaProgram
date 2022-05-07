package pkg1;

import java.util.Arrays;
import java.util.Iterator;
public class ClassB {

	public static void main(String[] args) 
	{
		int[]a= {889,426,589,123,5};
		
		// Print lagest no.from given array
		
		
		int maxnum=a[0];
		
		for(int i=1;i<(a.length);i++)
		{
			if(maxnum<a[i])
			{
				maxnum=a[i];
			}
			
		}
	
		System.out.println(maxnum);
		
		
		
		
//*************************************************************
		// Print smallest no.from given array
	 int[]b= {889,426,589,123,5};
		
		// Print lagest no.from given array
		
		
		int minino=b[0];
		
		for(int i=1;i<(b.length);i++)
		{
			if(minino>b[i])
			{
				minino=b[i];
			}
			
		}
	
		System.out.println(minino);
		
		
	}

}
