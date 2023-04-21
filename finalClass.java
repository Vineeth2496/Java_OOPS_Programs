interface Project
{
	void task();
}
final class Sub1 implements Project
{
	public void task()
	{
	String name="vineeth";
	int leng=name.length();
	String rev="";
		for(int i=leng-1; i>=0; i--)
		{
		rev= rev+name.charAt(i);
		System.out.println("String reverse of "+name+"is :"+rev);
		}
	}
}
class finalClass
{
public static void main(String[]args)
	{
	Project p=new Sub1();
	p.task();
	}
}