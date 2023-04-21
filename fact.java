package com.Factorial;
public class fact
{
	int no, facto=1;
	public void task()
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter Number");
	no=sc.nextInt();
	for(int i=1; i<=no; i++)
		{
		facto = facto * i;
		}
	System.out.println("Factorial value of "+no+" is: "+facto);
	}
}