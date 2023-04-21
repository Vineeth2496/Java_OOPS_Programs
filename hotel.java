interface Resturent
{
	void menu();
	void bill();
}
class Bawarchi implements Resturent
{
	public void menu()
	{
	System.out.println("Non-Veg");
	}
	public void bill()
	{
	int a=10;
	int b=12;
	int res=a+b; 
	System.out.println("Bill amount is"+res);
	}
	public void bill(int x)
	{
	System.out.println("X value is"+x);
	}		
}
class ShaGHouse implements Resturent
{
	public void menu()
	{
	System.out.println("Non-Veg");
	}
	public void menu(String veg)
	{
	System.out.println("Veg item: "+veg);
	}

	public void bill()
	{
	int a=13;
	int b=12;
	int res=a+b; 
	System.out.println("Bill amount is"+res);
	}
}
class hotel
{
public static void main(String[]args)
	{
	Resturent r=new Bawarchi();
	r.menu();
	r.bill();
	Bawarchi b=new Bawarchi();
	b.bill(5);
	Resturent r1=new ShaGHouse();
	r1.menu();
	r1.bill();
	ShaGHouse b1=new ShaGHouse();
	b1.menu("Meals");

	}
}
