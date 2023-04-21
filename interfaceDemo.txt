interface techlead1
{
	int u=10;
	int v=20;
	void task1();
	void task2();
}
interface techlead2
{
	int w=12;
	int x=25;
	void task3();
	void task4();
}
interface fibonacci
{
	void fibo();
}
interface factorial
{
	void fact();
}
interface leapyear
{
	void leap1();
	void leap2();
}
class Developer implements techlead1, techlead2, fibonacci, factorial, leapyear
{
	public void task1()
	{
	int sum=u+v;
	System.out.println("Sum value is: "+sum);
	}
	public void task2()
	{
	int diff=u+v;
	System.out.println("Substraction value is: "+diff);
	}
	public void task3()
	{
	int mul=w+x;
	System.out.println("Multiplication value is: "+mul);
	}
	public void task4()
	{
	int div=x/w;
	System.out.println("Substraction value is: "+div);
	}
	public void fibo()
	{
	int a=0 ,b=1, c;
	for(int i=0; i<=20; i++)
		{
		c=a+b;
		a=b;
		b=c;
		System.out.println(a);
		}
	}
	public void fact()
	{
	int no, fact=1;
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter Factorial No. to find:");
	no=sc.nextInt();
	for(int i=1; i<=no; i++)
		{
		fact = fact * i;
		}
	System.out.println("Factorial value of " + no +" is: " +fact); 
	}
	public void leap1()
	{
	int year;
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter year: ");
	year = sc.nextInt();		
	if(year%4==0)
		{
		if(year%100==0)
			{
			if(year%400==0)
				{
				System.out.println("Leap year");
				}
			else
				{
				System.out.println("Not a Leap year");
				}
			}
		else
			{
			System.out.println("Leap Year");
			}
		}
	else
		{
		System.out.println("Not a Leap year");
		}
	}
	public void leap2()
	{
	int year;
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter year");
	year = sc.nextInt();
	if((year%400==0)||(year%4==0 && year%100!=0))
		{
		System.out.println("Leap year");
		}
	else
		{
		System.out.println("Not a Leap year");
		}
	}
}
class interfaceDemo
{
public static void main(String[]args)
	{
	techlead1 t1=new Developer();
	t1.task1();
	t1.task2();
	techlead2 t2=new Developer();
	t2.task3();
	t2.task4();
	fibonacci f=new Developer();
	f.fibo();
	factorial f2=new Developer();
	f2.fact();
	leapyear l=new Developer();
	l.leap1();
	l.leap2();
	}
}


