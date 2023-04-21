class PrimeNumber
{
public void task1()
	{
	int no;
	int temp = 0;
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter Number: ");
	no=sc.nextInt();
	for(int i=2; i<=no-1; i++)
		{
		if(no%i==0)
			{
			temp=temp+1;
			}
		}
		if(temp==0)
			{
			System.out.println(no+" is a prime number");
			}
		else
			{
			System.out.println(no+ " is not a prime number");
			}
	}
	static class PrimeNumbers
	{
	public void task2()
		{
		int temp1=0;
		for(int no=1; no<=25; no++)
			{
			for(int i=2; i<=no-1; i++)
				{
				if(no%i==0)
					{
					temp1=temp1+1;
					}
				}
				if(temp1==0)
					{
					System.out.println(no);
					}
				else
					{
					temp1=0;
					}
			}
		}
	}
}
class NestClient
{
public static void main(String[]args)
	{
	PrimeNumber p=new PrimeNumber();
	p.task1();
	PrimeNumber.PrimeNumbers p1=new PrimeNumber.PrimeNumbers();
	p1.task2();	
	}
}