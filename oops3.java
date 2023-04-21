class main
{
	private int a,b,c;
	private char x;
	private String y;

	public main(int a)  	// constructor..  //4  
	{
	this.a=a;
  	}
	public  main(int a, int b) 
	{
	this.a=a;
	this.b=b;
	}
	public main(int a, int b, int c)
	{
	this.a=a;
    	this.b=b;
   	this.c=c;
  	}
	public main(int a, char x, String y)
  	{
    	this.a=a;
    	this.x=x;
    	this.y=y;
  	}
		public void task1()
   		{
   		System.out.println(" a value is :"+a); //   
   		}
		public void task2()
        		{
  		System.out.println(" a value is :"+a);
  		System.out.println(" b value is :"+b);
          		}  
		public void task3()
     		{
  		System.out.println(" a value is :"+a);
  		System.out.println(" b value is :"+b);
  		System.out.println(" c value is :"+c);
     		}
		public void task4()
      		{
  		System.out.println(" a value is :"+a);
 		System.out.println(" x value is :"+x);
  		System.out.println(" y value is :"+y);
  		}
 }		// closging program


class oops3
{
	public static void main(String[]args)  
	{
	main d=new main(1);
   	d.task1();
	System.out.println("  ===========================");
	main d1=new main(23,14);
  	d1.task2();	
 	System.out.println("  ===========================");
	main  d2=new main(11,22,33);
	d2.task3();  
 	System.out.println("  ===========================");
	main  d3=new main(100,'t',"VNCIT");
   	d3.task4();
    	} 
}