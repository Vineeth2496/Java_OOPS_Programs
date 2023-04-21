class Development
{
public void impCasting()
	{
	char a='Z';
	int b;
	
	b=a;
	System.out.println("b value is: "+b);
	}
public void expCasting()
	{
	int a=38;
	char b;
	
	b=(char)a;
	System.out.println("b value is: "+b);
	}
}

class Casting
{
public static void main(String[]args)
	{
	Development d=new Development();
	d.impCasting();
	d.expCasting();
	}
}