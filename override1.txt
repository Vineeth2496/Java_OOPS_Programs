class Superclass
{
/*	private int a;
	public Superclass(int a)
	{
	this.a=a;
	}	*/
	public void task1()
	{
	System.out.println("This is supercalss: ");
	}
}

class Subclass extends Superclass
{
/*	private int b;
	public Subclass(int b)
	{
	super(b);
	}	*/
	public void task1()
	{
	System.out.println("This is subcalss: ");
	}
}
class override1
{
public static void main(String[]args)
	{
	Superclass s=new Subclass();
	s.task1();

/*	Subclass s1=(Subclass)new Superclass();
	s1.task1();	*/
	}
}