abstract class HospitalServices
{
	private String Op_No;
	private static String Fee="500";
	private static String GST="5%";
	public HospitalServices(String Op_No)
	{
	this.Op_No=Op_No;
	}
	public void OP_No()
	{
	System.out.println("Out-Patient No:" +Op_No);
	}
	public abstract void OutPatientDetails();
	public static void Consultation_Fee()
	{
	System.out.println("Consultation Fee: " + Fee+ "/-");
	}
}

class Care_Hospital extends HospitalServices
{
	public Care_Hospital(String Op_No)
	{
	super(Op_No);	
	}
	public void OutPatientDetails()
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	String Name, Age, Gender, B_P , Phone_No, Address, Date;
	int  Doctor_Specialization, Weight; 
	System.out.println("*****CARE HOSPITAL********");
	System.out.println("Enter Patient Name:");
	Name=sc.next();
	System.out.println("Enter Patient Age:");
	Age=sc.next();
	System.out.println("Enter Patient Gender:");
	Gender=sc.next();
	System.out.println("Enter Patient Blood Pressure:");
	B_P=sc.next();
	System.out.println("Enter Weight: ");
	Weight=sc.nextInt();
	System.out.println("Enter Date: ");
	Date=sc.next();
	System.out.println("Enter Patient Phone_No:");
	Phone_No=sc.next();
	System.out.println("Enter Patient Address:");
	Address=sc.next();
	System.out.println("*****DOCTOR SPECIALIZATION******");
	System.out.println("1. M.D. GENERAL PHYSICAIN");
	System.out.println("2. NUROLOGIST");
	System.out.println("3. ORTHOPEDIC SURGEON");
	System.out.println("4. OBSTETRICIAN-GYNECOLOGIST");
	Doctor_Specialization=sc.nextInt();
	
	switch(Doctor_Specialization)
	{
	case 1:
		{
		System.out.println("*****WELCOME CARE HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: M.D. GENERAL PHYSICAIN");
		System.out.println("Your Appointment with consult Doctor has confirmed.");
		
		String BloodTest;
		String UrineTest;
		System.out.println("Enter yes or no for BloodTest:");
		BloodTest=sc.next();	
		System.out.println("Enter yes or no for UrineTest:");
		UrineTest=sc.next();		
		if(BloodTest.equals("yes") && UrineTest.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check body condition please do of following test at lab. ");
		System.out.println("Please visit Lab and give blood and urine sample at Lab for Test");
		int B_Test=350;
		int U_Test=300;
		int BU_Test=B_Test +U_Test;
		System.out.println("Blood and Urine Test Fee: "+BU_Test);
		System.out.println("Please collect the Blood & Urine Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=20;
		double medi_2=24;
		double medi_3=32;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else if(BloodTest.equals("yes"))
		{
		System.out.println("After consulation with doctor, " + "\n" + "to check body condition please do of following test at lab. ");
		System.out.println("Please visit Lab and give blood sample at Lab for Test");
		int B_Test=350;
		int U_Test=300;
		int BU_Test=B_Test ;
		System.out.println("Blood Test Fee: "+BU_Test);
		System.out.println("Please collect the Blood Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=22;
		double medi_2=21;
		double medi_3=29;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=26;
		double medi_2=21;
		double medi_3=27;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}		
		break;
		
		}
	case 2:
		{
		System.out.println("*****WELCOME CARE HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: NUROLOGIST");

		String X_Ray;
		String CT_Scan;
		String MRI_Scan;
		System.out.println("Enter yes or no for X-Ray:");
		X_Ray=sc.next();		
		System.out.println("Enter yes or no for CT Scan:");
		CT_Scan=sc.next();	
		System.out.println("Enter yes or no for MRI SCAN:");
		MRI_Scan=sc.next();
		if(X_Ray.equals("yes"))
		{
		System.out.println("After consulation with doctor, to check bones injury Test ");
		System.out.println("Please visit Laboratory");
		int X_ray=600;
		int CTScan=1100;
		int MRIScan=3500;
		int Tot_Xray=X_ray;
		System.out.println("X-Ray Fee: "+Tot_Xray);
		System.out.println("Please collect the X-ray reports and visit back to Doctor");
		System.out.println("After checking the X-ray reports Doctor will do treatment and" + "\n" + "provide certain Prescription for Medicine");
		double medi_1=200;
		double medi_2=212;
		double medi_3=315;
		double medi_4=260;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else if(CT_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor, to check bones injury Test ");
		System.out.println("Please visit Laboratory");
		int X_ray=600;
		int CTScan=1100;
		int MRIScan=3500;
		int Tot_CT=CTScan;
		System.out.println("CT Scan Fee: "+Tot_CT);
		System.out.println("Please collect the CT-Scan reports and visit back to Doctor");
		System.out.println("After checking the CT-Scan reports Doctor will do treatment and" + "\n" + "provide certain Prescription for Medicine");
		double medi_1=229;
		double medi_2=210;
		double medi_3=291;
		double medi_4=267;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else if(MRI_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor, to check bones injury Test ");
		System.out.println("Please visit Laboratory");
		int X_ray=600;
		int CTScan=1100;
		int MRIScan=3500;
		int Tot_MRI=MRIScan;
		System.out.println("MRI Scan Fee: "+Tot_MRI);
		System.out.println("Please collect the MRI-Scan reports and visit back to Doctor");
		System.out.println("After checking the MRI-Scan reports Doctor will do treatment and" + "\n" + "provide certain Prescription for Medicine");
		double medi_1=229;
		double medi_2=210;
		double medi_3=291;
		double medi_4=267;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=26;
		double medi_2=21;
		double medi_3=27;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		break;
		}
	case 3:
		{
		System.out.println("*****WELCOME CARE HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: ORTHOPEDIC SURGEON");
		
		String X_Ray;
		String MRI_Scan;
		System.out.println("Enter yes or no for X-Ray:");
		X_Ray=sc.next();		
		System.out.println("Enter yes or no for MRI SCAN:");
		MRI_Scan=sc.next();
		if(X_Ray.equals("yes"))
		{
		System.out.println("After consulation with doctor, to check bones injury Test ");
		System.out.println("Please visit Laboratory");
		int X_ray=600;
		int MRIScan=3500;
		int Tot_Xray=X_ray;
		System.out.println("X-Ray Fee: "+Tot_Xray);
		System.out.println("Please collect the X-ray reports and visit back to Doctor");
		System.out.println("After checking the X-ray reports Doctor will do treatment and" + "\n" + "provide certain Prescription for Medicine");
		double medi_1=180;
		double medi_2=220;
		double medi_3=305;
		double medi_4=290;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else if(MRI_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor, to check bones injury Test ");
		System.out.println("Please visit Laboratory");
		int X_ray=600;
		int MRIScan=3500;
		int Tot_MRI=MRIScan;
		System.out.println("MRI Scan Fee: "+Tot_MRI);
		System.out.println("Please collect the MRI-Scan reports and visit back to Doctor");
		System.out.println("After checking the MRI-Scan reports Doctor will do treatment and" + "\n" + "provide certain Prescription for Medicine");
		double medi_1=229;
		double medi_2=210;
		double medi_3=291;
		double medi_4=267;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=26;
		double medi_2=21;
		double medi_3=27;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		break;
		}
	case 4:
		{
		System.out.println("*****WELCOME CARE HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: OBSTETRICIAN-GYNECOLOGIST");

		String BloodTest;
		String UrineTest;
		String UltraSound_Scan;
		System.out.println("Enter yes or no for BloodTest:");
		BloodTest=sc.next();	
		System.out.println("Enter yes or no for UrineTest:");
		UrineTest=sc.next();	
		System.out.println("Enter yes or no for UltraSound Scan:");
		UltraSound_Scan=sc.next();		
		if(BloodTest.equals("yes") && UrineTest.equals("yes") && UltraSound_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check body condition please do of following test at lab. ");
		System.out.println("Please visit Lab and give blood, urine sample and UltraSound Scan at  Lab and Laboratory for Test");
		int B_Test=350;
		int U_Test=300;
		int US_Scan=1600;
		int BUS_Test=B_Test +U_Test+US_Scan;
		System.out.println("Blood, Urine Test, UltraSound Scan Fee: "+BUS_Test);
		System.out.println("Please collect the Blood, Urine and UltraSound Scan,"+"\n" + "Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=490;
		double medi_2=240;
		double medi_3=322;
		double medi_4=269;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else if(UltraSound_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check body condition please do of following test at lab. ");
		System.out.println("Please visit for UltraSound Scan at Laboratory for Test");
		int US_Scan=1600;
		int US_Test=US_Scan;
		System.out.println("UltraSound Scan Fee: "+US_Test);
		System.out.println("Please collect UltraSound Scan Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=497;
		double medi_2=539;
		double medi_3=120;
		double medi_4=208;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=216;
		double medi_2=218;
		double medi_3=278;
		double medi_4=269;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}		

		break;
		}
	default:
		{
		System.out.println("Please check Physicain and Consult.");
		}
	}
	}


}

class Image_Hospital extends HospitalServices
{
	public Image_Hospital(String Op_No)
	{
	super(Op_No);	
	}
	public void OutPatientDetails()
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	String Name, Age, Gender, B_P , Phone_No, Address, Date;
	int  Doctor_Specialization, Weight; 
	System.out.println("*******IMAGE HOSPITAL********");
	System.out.println("Enter Patient Name:");
	Name=sc.next();
	System.out.println("Enter Patient Age:");
	Age=sc.next();
	System.out.println("Enter Patient Gender:");
	Gender=sc.next();
	System.out.println("Enter Weight: ");
	Weight=sc.nextInt();
	System.out.println("Enter Date: ");
	Date=sc.next();
	System.out.println("Enter Patient Blood Pressure:");
	B_P=sc.next();
	System.out.println("Enter Patient Phone_No:");
	Phone_No=sc.next();
	System.out.println("Enter Patient Address:");
	Address=sc.next();
	System.out.println("*****DOCTOR SPECIALIZATION******");
	System.out.println("1. M.D. GENERAL PHYSICAIN");
	System.out.println("2. OTOLARYNGOLOGISTS ENT");
	System.out.println("3. ORTHOPEDIC SURGEON");
	System.out.println("4. OBSTETRICIAN-GYNECOLOGIST");
	System.out.println("5. GASTROENTEROLOGISTS");
	Doctor_Specialization=sc.nextInt();
	
	switch(Doctor_Specialization)
	{
	case 1:
		{
		System.out.println("*****WELCOME IMAGE HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: M.D. GENERAL PHYSICAIN");
		
		String BloodTest;
		String UrineTest;
		System.out.println("Enter yes or no for BloodTest:");
		BloodTest=sc.next();	
		System.out.println("Enter yes or no for UrineTest:");
		UrineTest=sc.next();		
		if(BloodTest.equals("yes") && UrineTest.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check body condition please do of following test at lab. ");
		System.out.println("Please visit Lab and give blood and urine sample at Lab for Test");
		int B_Test=350;
		int U_Test=300;
		int BU_Test=B_Test +U_Test;
		System.out.println("Blood and Urine Test Fee: "+BU_Test);
		System.out.println("Please collect the Blood & Urine Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=20;
		double medi_2=24;
		double medi_3=32;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else if(BloodTest.equals("yes"))
		{
		System.out.println("After consulation with doctor, " + "\n" + "to check body condition please do of following test at lab. ");
		System.out.println("Please visit Lab and give blood sample at Lab for Test");
		int B_Test=350;
		int U_Test=300;
		int BU_Test=B_Test ;
		System.out.println("Blood Test Fee: "+BU_Test);
		System.out.println("Please collect the Blood Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=22;
		double medi_2=21;
		double medi_3=29;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=26;
		double medi_2=21;
		double medi_3=27;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}		

		break;
		}
	case 2:
		{
		System.out.println("*****WELCOME IMAGE HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: OTOLARYNGOLOGISTS ENT");

		String CT_Scan;
		System.out.println("Enter yes or no for CT-Scan:");
		CT_Scan=sc.next();	
		if(CT_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check Ear, Nosie, Throat condition please do of following test at lab. ");
		System.out.println("Please visit Laborarty for ENT Test");
		int CTScan=1350;
		int ENT_Test=CTScan;
		System.out.println("Blood and Urine Test Fee: "+ENT_Test);
		System.out.println("Please collect the CT Scant reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=201;
		double medi_2=243;
		double medi_3=325;
		double medi_4=262;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=223;
		double medi_2=197;
		double medi_3=271;
		double medi_4=226;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		break;
		}
	case 3:
		{
		System.out.println("*****WELCOME IMAGE HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: ORTHOPEDIC SURGEON");

		String X_Ray;
		String MRI_Scan;
		System.out.println("Enter yes or no for X-Ray:");
		X_Ray=sc.next();		
		System.out.println("Enter yes or no for MRI SCAN:");
		MRI_Scan=sc.next();
		if(X_Ray.equals("yes"))
		{
		System.out.println("After consulation with doctor, to check bones injury Test ");
		System.out.println("Please visit Laboratory");
		int X_ray=600;
		int MRIScan=3500;
		int Tot_Xray=X_ray;
		System.out.println("X-Ray Fee: "+Tot_Xray);
		System.out.println("Please collect the X-ray reports and visit back to Doctor");
		System.out.println("After checking the X-ray reports Doctor will do treatment and" + "\n" + "provide certain Prescription for Medicine");
		double medi_1=180;
		double medi_2=220;
		double medi_3=305;
		double medi_4=290;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else if(MRI_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor, to check bones injury Test ");
		System.out.println("Please visit Laboratory");
		int X_ray=600;
		int MRIScan=3500;
		int Tot_MRI=MRIScan;
		System.out.println("MRI Scan Fee: "+Tot_MRI);
		System.out.println("Please collect the MRI-Scan reports and visit back to Doctor");
		System.out.println("After checking the MRI-Scan reports Doctor will do treatment and" + "\n" + "provide certain Prescription for Medicine");
		double medi_1=229;
		double medi_2=210;
		double medi_3=291;
		double medi_4=267;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=26;
		double medi_2=21;
		double medi_3=27;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		break;
		}
	case 4:
		{
		System.out.println("*****WELCOME IMAGE HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: OBSTETRICIAN-GYNECOLOGIST");

		String BloodTest;
		String UrineTest;
		String UltraSound_Scan;
		System.out.println("Enter yes or no for BloodTest:");
		BloodTest=sc.next();	
		System.out.println("Enter yes or no for UrineTest:");
		UrineTest=sc.next();	
		System.out.println("Enter yes or no for UltraSound Scan:");
		UltraSound_Scan=sc.next();		
		if(BloodTest.equals("yes") && UrineTest.equals("yes") && UltraSound_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check body condition please do of following test at lab. ");
		System.out.println("Please visit Lab and give blood, urine sample and UltraSound Scan at  Lab and Laboratory for Test");
		int B_Test=350;
		int U_Test=300;
		int US_Scan=1600;
		int BUS_Test=B_Test +U_Test+US_Scan;
		System.out.println("Blood, Urine Test, UltraSound Scan Fee: "+BUS_Test);
		System.out.println("Please collect the Blood, Urine and UltraSound Scan,"+"\n" + "Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=490;
		double medi_2=240;
		double medi_3=322;
		double medi_4=269;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else if(UltraSound_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check body condition please do of following test at lab. ");
		System.out.println("Please visit for UltraSound Scan at Laboratory for Test");
		int US_Scan=1600;
		int US_Test=US_Scan;
		System.out.println("UltraSound Scan Fee: "+US_Test);
		System.out.println("Please collect UltraSound Scan Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=497;
		double medi_2=539;
		double medi_3=120;
		double medi_4=208;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=216;
		double medi_2=218;
		double medi_3=278;
		double medi_4=269;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}		
		break;
		}
	case 5:
		{
		System.out.println("*****WELCOME IMAGE HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: GASTROENTEROLOGISTS");

		String CT_Scan;
		System.out.println("Enter yes or no for CT-Scan:");
		CT_Scan=sc.next();	
		if(CT_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check Gastro, Liver condition please do of following test at lab. ");
		System.out.println("Please visit Laborarty for Gastroentero Test");
		int CTScan=1350;
		int Gas_Test=CTScan;
		System.out.println("Gastroentro Test Fee: "+Gas_Test);
		System.out.println("Please collect the CT Scant reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=211;
		double medi_2=241;
		double medi_3=339;
		double medi_4=220;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=223;
		double medi_2=197;
		double medi_3=271;
		double medi_4=226;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}

		break;
		}
	default:
		{
		System.out.println("Please check Physicain and Consult.");
		}
	}
	}
}

class Yashoda_Hospital extends HospitalServices
{
public Yashoda_Hospital(String Op_No)
	{
	super(Op_No);	
	}
	public void OutPatientDetails()
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	String Name, Age, Gender, B_P , Phone_No, Address, Date;
	int  Doctor_Specialization, Weight; 
	System.out.println("*******YASHODA HOSPITAL********");
	System.out.println("Enter Patient Name:");
	Name=sc.next();
	System.out.println("Enter Patient Age:");
	Age=sc.next();
	System.out.println("Enter Patient Gender:");
	Gender=sc.next();
	System.out.println("Enter Weight: ");
	Weight=sc.nextInt();
	System.out.println("Enter Date: ");
	Date=sc.next();
	System.out.println("Enter Patient Blood Pressure:");
	B_P=sc.next();
	System.out.println("Enter Patient Phone_No:");
	Phone_No=sc.next();
	System.out.println("Enter Patient Address:");
	Address=sc.next();
	System.out.println("*****DOCTOR SPECIALIZATION******");
	System.out.println("1. M.D. GENERAL PHYSICAIN");
	System.out.println("2. ONCOLOGISTS-CANCER SPECIALIST");
	System.out.println("3. PULMONOLOGISTS LUNG CANCER SPECIALIST");
	System.out.println("4. OBSTETRICIAN-GYNECOLOGIST");
	System.out.println("5. GASTROENTEROLOGISTS");
	Doctor_Specialization=sc.nextInt();
	
	switch(Doctor_Specialization)
	{
	case 1:
		{
		System.out.println("*****WELCOME YASHODA HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: M.D. GENERAL PHYSICAIN");

		String BloodTest;
		String UrineTest;
		System.out.println("Enter yes or no for BloodTest:");
		BloodTest=sc.next();	
		System.out.println("Enter yes or no for UrineTest:");
		UrineTest=sc.next();		
		if(BloodTest.equals("yes") && UrineTest.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check body condition please do of following test at lab. ");
		System.out.println("Please visit Lab and give blood and urine sample at Lab for Test");
		int B_Test=350;
		int U_Test=300;
		int BU_Test=B_Test +U_Test;
		System.out.println("Blood and Urine Test Fee: "+BU_Test);
		System.out.println("Please collect the Blood & Urine Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=20;
		double medi_2=24;
		double medi_3=32;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else if(BloodTest.equals("yes"))
		{
		System.out.println("After consulation with doctor, " + "\n" + "to check body condition please do of following test at lab. ");
		System.out.println("Please visit Lab and give blood sample at Lab for Test");
		int B_Test=350;
		int U_Test=300;
		int BU_Test=B_Test ;
		System.out.println("Blood Test Fee: "+BU_Test);
		System.out.println("Please collect the Blood Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=22;
		double medi_2=21;
		double medi_3=29;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=26;
		double medi_2=21;
		double medi_3=27;
		double medi_4=26;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}		
		break;
		}
	case 2:
		{
		System.out.println("*****WELCOME YASHODA HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: ONCOLOGISTS-CANCER SPECIALIST");

		String CT_Scan;
		System.out.println("Enter yes or no for CT-Scan:");
		CT_Scan=sc.next();	
		if(CT_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check Cancer condition please do of following test at lab. ");
		System.out.println("Please visit Laborarty for Oncology Test");
		int CTScan=1350;
		int Onco_Test=CTScan;
		System.out.println("Gastroentro Test Fee: "+Onco_Test);
		System.out.println("Please collect the CT Scant reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=215;
		double medi_2=291;
		double medi_3=399;
		double medi_4=270;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=223;
		double medi_2=197;
		double medi_3=271;
		double medi_4=226;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		break;
		}
	case 3:
		{
		System.out.println("*****WELCOME YASHODA HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: PULMONOLOGISTS LUNG CANCER SPECIALIST");

		String CT_Scan;
		System.out.println("Enter yes or no for CT-Scan:");
		CT_Scan=sc.next();	
		if(CT_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check Lung Cancer condition please do of following test at lab. ");
		System.out.println("Please visit Laborarty for Pulmonology Test");
		int CTScan=1350;
		int Pulmono_Test=CTScan;
		System.out.println("Gastroentro Test Fee: "+Pulmono_Test);
		System.out.println("Please collect the CT Scant reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=213;
		double medi_2=249;
		double medi_3=570;
		double medi_4=645;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=253;
		double medi_2=118;
		double medi_3=459;
		double medi_4=298;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		break;
		}
	case 4:
		{
		System.out.println("*****WELCOME YASHODA HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: OBSTETRICIAN-GYNECOLOGIST");

		String BloodTest;
		String UrineTest;
		String UltraSound_Scan;
		System.out.println("Enter yes or no for BloodTest:");
		BloodTest=sc.next();	
		System.out.println("Enter yes or no for UrineTest:");
		UrineTest=sc.next();	
		System.out.println("Enter yes or no for UltraSound Scan:");
		UltraSound_Scan=sc.next();		
		if(BloodTest.equals("yes") && UrineTest.equals("yes") && UltraSound_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check body condition please do of following test at lab. ");
		System.out.println("Please visit Lab and give blood, urine sample and UltraSound Scan at  Lab and Laboratory for Test");
		int B_Test=350;
		int U_Test=300;
		int US_Scan=1600;
		int BUS_Test=B_Test +U_Test+US_Scan;
		System.out.println("Blood, Urine Test, UltraSound Scan Fee: "+BUS_Test);
		System.out.println("Please collect the Blood, Urine and UltraSound Scan,"+"\n" + "Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=490;
		double medi_2=240;
		double medi_3=322;
		double medi_4=269;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else if(UltraSound_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check body condition please do of following test at lab. ");
		System.out.println("Please visit for UltraSound Scan at Laboratory for Test");
		int US_Scan=1600;
		int US_Test=US_Scan;
		System.out.println("UltraSound Scan Fee: "+US_Test);
		System.out.println("Please collect UltraSound Scan Test reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=497;
		double medi_2=539;
		double medi_3=120;
		double medi_4=208;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=216;
		double medi_2=218;
		double medi_3=278;
		double medi_4=269;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}		
		break;
		}
	case 5:
		{
		System.out.println("*****WELCOME YASHODA HOSPITAL********");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Blood Pressure: "+B_P);
		System.out.println("Weight : "+Weight);
		System.out.println("Date : "+Date);
		System.out.println("Phone No :"+Phone_No);
		System.out.println("Address : "+Address);
		System.out.println("Consult Doctor: GASTROENTEROLOGISTS");
		String CT_Scan;
		System.out.println("Enter yes or no for CT-Scan:");
		CT_Scan=sc.next();	
		if(CT_Scan.equals("yes"))
		{
		System.out.println("After consulation with doctor,"+"\n"+" to check Gastro, Liver condition please do of following test at lab. ");
		System.out.println("Please visit Laborarty for Gastroentero Test");
		int CTScan=1350;
		int Gas_Test=CTScan;
		System.out.println("Gastroentro Test Fee: "+Gas_Test);
		System.out.println("Please collect the CT Scant reports and visit back to Doctor");
		System.out.println("After checking the reports Doctor will provide certain Prescription for Medicine");
		double medi_1=211;
		double medi_2=241;
		double medi_3=339;
		double medi_4=220;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		else
		{
		System.out.println("After checkup, Doctor provide certain Prescription for Medicine. ");
		double medi_1=223;
		double medi_2=197;
		double medi_3=271;
		double medi_4=226;
		double GST_5=0.05;
		double Tot_medi=medi_1+medi_2+medi_3+medi_4;
		double GST=Tot_medi * GST_5;
		double Tot_Amt=Tot_medi + GST;
		System.out.println("Sub total	: "+Tot_medi);
		System.out.println("GST 5%	: "+GST);
		System.out.println("Total Medicine Amount"+Tot_Amt);
		}
		break;
		}
	default:
		{
		System.out.println("Please check Physicain and Consult.");
		}
	}
	}
}


class Patient
{
public static void main(String[]args)
	{
	HospitalServices h=new Care_Hospital("210");
	h.OP_No();
	h.OutPatientDetails();
	h.Consultation_Fee();	
	HospitalServices h1=new Image_Hospital("211");
	h1.OP_No();
	h1.OutPatientDetails();
	h1.Consultation_Fee();	
	HospitalServices h2=new Yashoda_Hospital("212");
	h2.OP_No();
	h2.OutPatientDetails();
	h2.Consultation_Fee();
	}
}

