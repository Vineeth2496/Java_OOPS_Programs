package  com.EvenOdd;
public class Even_Odd
{
	public void task()
	{
	for(int no=1; no<=100; no++)
		{
		if(no%2==0)
			{
			System.out.println(no+" is a Even Number");
			}
		else
			{
			System.out.println();		//(no+" is a Odd Number");
			}
		}
	}
}


/*
{
	int no;
	public void task()
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter Number");
	no=sc.nextInt();
	if(no%2==0)
		{
		System.out.println(no+" is a Even Number");
		}
	else
		{
		System.out.println(no+" is a Odd Number");
		}
	}
}
*/