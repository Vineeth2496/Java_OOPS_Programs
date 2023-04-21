class App1
{
	int a=10;
	void task1()
	{
	System.out.println("a value is:"+(a+a));
	}
}
class App2
{
	int b=20;
	void task2()
	{
	System.out.println("b value is:"+(b+b));
	}
}
class App3
{
	int c=30;
	void task3()
	{
	System.out.println("c value is:"+(c+c));
	}
}
class oops1
{
	public static void main(String[]args)
	{
	App1 a1=new App1();
	a1.task1();
	App2 a2=new App2();
	a2.task2();
	App3 a3=new App3();
	a3.task3();


	}
	
}