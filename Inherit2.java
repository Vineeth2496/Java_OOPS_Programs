class A
{
	private int a,b,c;
	
	public A(int a,int b)
	{
	this.a=a;
	this.b=b;
	}
	public A(int c)
	{
	this.c=c;
	}
	public void task1()
	{
	System.out.println("a value is: "+a);
	System.out.println("b value is: "+b);
	System.out.println("c value is: "+c);
	}
	public void task2()
	{
	System.out.println("a value is: "+a);
	System.out.println("b value is: "+b);
	System.out.println("c value is: "+c);
	}
}

class B extends A
{
	public B(int a,int b)
	{
	super(a, b);
	}
	public B(int c)
	{
	super(c);
	}
}
class Inherit2
{
public static void main(String[]args)
	{
	B b=new B(10,20);
	b.task1();		
	B b1=new B(22);
	b1.task2();	
	}
}