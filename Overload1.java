 class A
{
	private int a, b;
	public A(int a, int b)
	{
	this.a=a;
	this.b=b;
	}
	public void task1()
	{
	int r=a+b;
	System.out.println("The Result is: "+r);
	}

	public void task1(int...c)
	{
	int r=a+b;
	int count=0;
	for(int x:c)
	{
		count =count+x;
		System.out.println("the count values are: "+count);
	}
	int sum=count+r;
	System.out.println("The sum value is: "+sum);
	
	}	
	public void task1(int a, int b)
	{
	int r1=a-b;
	System.out.println("The Result is: "+r1);
	}			
	
}
class Overload1
{
public static void main(String[]args)
	{
	A a=new A(1, 2);
	a.task1();
	a.task1(2,5,7,9,12,15);
	a.task1(20,16);
	}
}