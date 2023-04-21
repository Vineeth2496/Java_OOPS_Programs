abstract class factorial
{
	public abstract void task(); 
}
class AnonymousDemo
{
public static void main(String[]args)
	{
	factorial f=new factorial()
		{
		public void task()
			{
			int no,  fact=1;
			java.util.Scanner sc=new java.util.Scanner(System.in);
			System.out.println("Enter Number: ");
			no=sc.nextInt();
			for(int i=1; i<=no; i++)
				{
				fact = fact * i;
				}
			System.out.println("Factorial of "+ no +" is: "+fact);
			}
		};
	f.task();
	}
}