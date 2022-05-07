package pkg1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,i,fact=1;
		System.out.println("enter an int to cal fact num : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		if(n<0)
			System.out.println("num should be non-negative");
		else
		{
			for(i=1;i<=n;i++)
				fact=fact*i;
			System.out.println("factorial of "+n+" is ="+fact);
		
		}

	}

}
