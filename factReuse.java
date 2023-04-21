import com.Factorial.fact;
class factReuse extends fact
{
	public void task1()
	{
	fact f=new fact();
	f.task();
	}
public static void main(String[]args)
	{
	factReuse f1=new factReuse();
	f1.task1();		
	
	}
}