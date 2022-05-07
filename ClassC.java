package pkg1;

import java.util.Arrays;

public class ClassC {
	
	// Sort array in increment order

	public static void main(String[] args) 
	{
		int[]b= {889,46,589,2,5};
		for (int i=0;i<b.length;i++)
		{
			for (int j=0;j<b.length;j++)
			{
				if (b[i]<b[j])
				{
					int k=b[j];
					b[j]=b[i];
					b[i]=k;
				}
			
			}
		}
		System.out.println(Arrays.toString(b));
		
		
		
//********************************************************************
		// Sort array in decrement order

		int[]a= {889,46,589,2,5};
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					int k=a[j];
					a[j]=a[i];
					a[i]=k;
				}
			
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
