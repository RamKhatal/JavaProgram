package pkg1;

import java.util.Arrays;
import java.util.Scanner;

public class ClassD {



	public static void main(String[] args)
	{
	
		//===========take input from user for array=====================
		Scanner s = new Scanner(System.in);
		System.out.println("enter array size:");
		int size = s.nextInt();
		int[]a = new int[size];
		
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter your"+(i+1)+": ");
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));
	
		
//== =======print duplicate value from array======================
		for(int i=0;i<(a.length-1);i++)
		{
			int count =0;
			
			for(int j=0;j<a.length;j++)
			{
				if( a[i] == a[j])
				{
					
					count =count+1;
				}
				
			}
			System.out.println(a[i]   +   "Repeated :"  +count);
		}
		
		System.out.println(Arrays.toString(a));
	

}

}
