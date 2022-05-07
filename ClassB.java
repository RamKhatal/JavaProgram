package Rrk;

import java.util.Scanner;

// Armstrong no using while loop

public class ClassB {
	

	public static void main(String[] args) {
		int num,temp,res=0,rem;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the num:");
		num=scn.nextInt();
		temp=num;
//		for(int i=0;i<=9;i++)
//		{
//			for (int j=0;j<=9;j++)
		
		while(temp!=0)
		{
			rem=temp%10;
			res=res+(rem*rem*rem);
			temp=temp/10;
		}
//			}
		if(num==res)
		System.out.println("\nAmstrong number");
		else
			System.out.println("\nNot Amstrong number");
		
	}
}
