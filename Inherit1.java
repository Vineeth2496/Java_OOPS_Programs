
class A
{
	private int a;

	public A()
	{
	a =10;
	}
	public void task1()
	{
	System.out.println("a value is:"+a);
	}
}

class B extends A
{
	private int b;

	public B()
	{
	b =20;
	}
	public void task2()
	{
	System.out.println("b value is:"+b);
	}
}

class C extends B
{
	private int c;

	public C()
	{
	c =30;
	}
	public void task3()
	{
	System.out.println("c value is:"+c);
	}
}

class Inherit1
{
public static void main(String[]args)
	{
	C c=new C();
	c.task1();
	c.task2();
	c.task3();	
	}

}
/*
class A
{
	private int a;

	public A()
	{
	a =10;
	}
	public void task1()
	{
	System.out.println("a value is:"+a);
	}
}

class B
{
	private int b;

	public B()
	{
	b =20;
	}
	public void task2()
	{
	System.out.println("b value is:"+b);
	}
}

class C
{
	private int c;

	public C()
	{
	c =30;
	}
	public void task3()
	{
	A a=new A();		//HAS_A Relation Inheritance.
	a.task1();
	B b=new B();
	b.task2();
	System.out.println("c value is:"+c);
	}
}

class Inherit1
{
public static void main(String[]args)
	{
	C c=new C();
	c.task3();
	}

}
*/