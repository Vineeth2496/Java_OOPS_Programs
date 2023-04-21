class Exoverload
{
	private Integer id, a;
	private String name, disg;
	private Float sal;
	
	// Constructor Overloading
	public Exoverload(Integer id)
	{
	this.id=id;
	}
	public Exoverload(Integer id, String name, String disg)
	{
	this.id=id;
	this.name=name;
	this.disg=disg;
	}
	public Exoverload(Float sal)
	{
	this.sal=sal;
	}
	public void task1()
	{
	System.out.println("Employee ID is: "+id);
	}
	public void task2()
	{
	System.out.println("Employee ID is: "+id);
	System.out.println("Employee Name is: "+name);
	System.out.println("Employee Disignation is: "+disg);
	}
	public void task3()
	{
	System.out.println("Employee Salary is: "+sal);
	}
	//	Method Overloading

	public void task1(int a)
	{
	System.out.println("Square Root of a is:"+Math.sqrt(a));
	}
		
	
}
class Exeover
{
public static void main(String...args)
	{
	Integer id, a;
	String name, disg;
	Float sal;

	java.util.Scanner sc=new java.util.Scanner(System.in);

	System.out.println("Enter ID");
	id=sc.nextInt();

	System.out.println("Enter Squar root Value:");
	a=sc.nextInt();

	System.out.println("Enter Name");
	name=sc.next();

	System.out.println("Enter Designation");
	disg=sc.next();

	System.out.println("Enter Salary");
	sal=sc.nextFloat();	
	
	Exoverload e11=new Exoverload(id);
	e11.task1();
	e11.task1(a);
	Exoverload e22=new Exoverload(id, name, disg);
	e22.task2();
	e22.task1(a);
	Exoverload e33=new Exoverload(sal);
	e33.task3();
	
	Exoverload e1=new Exoverload(111);
	e1.task1();
	e1.task1(5);
	Exoverload e2=new Exoverload(111, "Katherine", "Actor");
	e2.task2();
	Exoverload e3=new Exoverload(60000.00f);
	e3.task3();

	
	}
}