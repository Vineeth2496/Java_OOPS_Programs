	class oops22
{
	private String id;
	private String name;
	private String batch_no;
	private String disignation;
	private String soldier_force;
	private String operation;
	private static String Miltery="ARMY NAVY AIR-FORCE";

	public oops22(String id, String name, String batch_no, String disignation )
	{
		this.id=id;
		this.name=name;
		this.batch_no=batch_no;
		this.disignation=disignation;
	}
	public oops22(String soldier_force, String operation)
	{
		this.soldier_force=soldier_force;
		this.operation=operation;
	}

	public void task1()
	{
	System.out.println("***********************SOLDIER DETAILS********************");
	System.out.println("SOLDIER ID:"+id);
	System.out.println("NAME:"+name);
	System.out.println("BATCH NO:"+batch_no);
	System.out.println("DISIGNATION:"+disignation);
	System.out.println("MILITERY FORCES:"+Miltery);
	}
	public void task2()
	{
	System.out.println("*********SOLDIER'S FORCES & OPERATIONS DETAILS*********");
	System.out.println("SOLDIER FORCE:"+soldier_force);
	System.out.println("MISSION:"+operation);
	}
}
class oops2
{	
	public static void main(String[]args)
		{	
	 	String id, name, batch_no, disignation, soldier_force, operation;
		java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.println("SOLDIER ID:");
		id=sc.next();
		System.out.println("NAME:");
		name=sc.next();
		System.out.println("BATCH NO:");
		batch_no=sc.next();
		System.out.println("DISIGNATION:");
		disignation=sc.next();
	oops22 v1=new oops22(id, name, batch_no,disignation);
	v1.task1();

	oops22 e1=new oops22("007","VINEETH","B23","LIEUTENANT COLONEL");
	e1.task1();

		System.out.println("SOLDIER FORCE:");
		soldier_force=sc.next();
		System.out.println("MISSION:");
		operation=sc.next();	
	oops22 v2=new oops22(soldier_force, operation);
	v2.task2();


	
	oops22 e2=new oops22("ARMY","KASHMIR FILES");
	e2.task2();






	}

}


