class Normal_Static
{
	private	int a=10;
	private int b=20;
	private static int c=30;
	private static int d=40;
/*
	public String toString()
		{
			int Add=a+b;
			double Div=(a+b)/c;
			double Div1=d/c;
			return Add + " " + Div + " " + " "+ Div1;
		}
*/
	public static void task1()
		{
			int Add=c+d;
			int Sub=d-c;
			int div= b/a;
			System.out.println("Sum value is: "+ Add + "/n"+"Differncce value is:" +  Sub + " Div value is: "+ div); 
		}
	public static void main(String[]args)
		{
/*		Normal_Static n=new Normal_Static();
		System.out.println("Normal method implementation: "+n.toString());
*/
		Normal_Static.task1();
//		System.out.println("Static method impelmentation:");
		}  
}