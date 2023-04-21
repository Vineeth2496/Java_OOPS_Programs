class Type
{
private int a=10;
private int b=12;
	public int add()
	{
	int res=a+b;
	return res;
	}
	public int sub()
	{
	int res1=a-b;
	return res1;
	}
	
}
class ReturnType
{
public static void main(String[]args)
	{
	Type t=new Type();
	System.out.println(t.add()+"+"+t.sub());
	}
}
