interface Supermarket
{
	int a=10;
	void task1();
}
class Submarket implements Supermarket
{
	public void task1()
	{
	System.out.println("Submarket is overridden Supermarket Successfully:"+a);
	}
	
	public void task1(int b)
	{
	System.out.println("Submarket Cube root value is::"+Math.cbrt(b));
	}

}
class ExecuteOveride
{
public static void main(String...args)
	{
	Supermarket e=new Submarket();
	e.task1();
	Submarket e1=new Submarket();
	e1.task1(30);

	}
}

/*
abstract class ExOverride
{
	Integer id;
	public ExOverride(Integer id)
	{
	this.id=id;
	}
	public void task1()
	{
	}
	public abstract void task2();
}
class ExeOveride extends ExOverride
{
//	Integer id;
	public ExeOveride(Integer id)	
	{
	super(id);
	}
	public void task1()		// Lossely Coupled
	{
	System.out.println("Task1 is Executed Sucessfully: "+id);
	}
	public void task2()		// Tightly Coupled
	{
	System.out.println("Task2 is Executed Sucessfully: "+id);
	}
}
class ExecuteOveride
{
public static void main(String...args)
	{
	ExOverride e=new ExeOveride(1111);
	e.task1();
	e.task2();
	}
}

*/