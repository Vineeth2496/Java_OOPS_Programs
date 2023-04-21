/*	INTERFACES IN JAVA 8 
	1) Default Methods
	2) Static Methods		
*/
interface I
{
	static void show()
	{
	System.out.println("Static Method of Interface I");
	}
}
class C
{
public static void main(String...args)
	{
	I.show();
	}
}

/*
interface I
{
	default void show1()	
	{
	System.out.println("Interface I");
	}
}
class A
{
public void show()
	{
	System.out.println("Class A");
	}
}
class C extends A implements I
{
public static void main(String...args)
	{
	C c=new C();
	c.show();	
	I i=new C();
	i.show1();
	}
}
*/