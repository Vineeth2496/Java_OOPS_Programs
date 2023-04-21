interface Movie
{
	void selectMovie();
}
class IMAX implements Movie
{
	public void selectMovie()
	{
	java.util.Scanner s=new java.util.Scanner(System.in);
	int screen;
	System.out.println("***WELCOME TO IMAX CINEMAS***");
	System.out.println("SELECT SCREEN-1: SPIDERMAN NO WAY HOME - 3D");
	System.out.println("SELECT SCREEN-2: RRR - 2D");
	screen=s.nextInt();
	switch(screen)
		{
		case 1:
			{
			int seat, qty;
			System.out.println("**WELCOME TO IMAX CINEMAS**");
			System.out.println("SPIDERMAN NO WAY HOME - 3D");
			System.out.println("SELECT SEATTING AREA'S");
			System.out.println("1.BALCONY");
			System.out.println("2.RECLINER");
			seat=s.nextInt();	
			switch(seat)
				{
				case 1:
					{
					System.out.println("BALCONY");
					double rate =100;
					System.out.println("Enter No. of tickets: ");
					qty=s.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("IMAX CINEMAS"+"\n"+"Spiderman No Way Home -3D"+"\n"+"Balcony"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				case 2:
					{
					System.out.println("RECLINER");
					double rate =150;
					System.out.println("Enter No. of tickets: ");
					qty=s.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("IMAX CINEMAS"+"\n"+"Spiderman No Way Home -3D"+"\n"+"Recliner"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				default:
					{
					System.out.println("Tickets not not available");
					}
				}
			}		
		case 2:
			{
			int seat, qty;
			System.out.println("**WELCOME TO IMAX CINEMAS**");
			System.out.println("RRR - 2D");
			System.out.println("SELECT SEATTING AREA'S");
			System.out.println("1.BALCONY");
			System.out.println("2.RECLINER");
			seat=s.nextInt();	
			switch(seat)
				{
				case 1:
					{
					System.out.println("BALCONY");
					double rate =100;
					System.out.println("Enter No. of tickets: ");
					qty=s.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("IMAX CINEMAS"+"\n"+"RRR -2D"+"\n"+"Balcony"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				case 2:
					{
					System.out.println("RECLINER");
					double rate =150;
					System.out.println("Enter No. of tickets: ");
					qty=s.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("IMAX CINEMAS"+"\n"+"RRR -2D"+"\n"+"Recliner"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				default:
					{
					System.out.println("Tickets not not available");
					}
				}		
				
			}
		}
	}
}


class PVR implements Movie
{
	public void selectMovie()
	{
	java.util.Scanner s1=new java.util.Scanner(System.in);
	int screen1;
	System.out.println("***WELCOME TO PVR CINEMAS***");
	System.out.println("SELECT SCREEN-1: MAJOR - 2D");
	System.out.println("SELECT SCREEN-2: KGF 2 - 2D");
	screen1=s1.nextInt();
	switch(screen1)
		{
		case 1:
			{
			int seat, qty;
			System.out.println("**WELCOME TO PVR CINEMAS**");
			System.out.println("MAJOR - 2D");
			System.out.println("SELECT SEATTING AREA'S");
			System.out.println("1.BALCONY");
			System.out.println("2.RECLINER");
			seat=s1.nextInt();	
			switch(seat)
				{
				case 1:
					{
					System.out.println("BALCONY");
					double rate =100;
					System.out.println("Enter No. of tickets: ");
					qty=s1.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("PVR CINEMAS"+"\n"+"MAJOR -2D"+"\n"+"Balcony"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				case 2:
					{
					System.out.println("RECLINER");
					double rate =150;
					System.out.println("Enter No. of tickets: ");
					qty=s1.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("PVR CINEMAS"+"\n"+"MAJOR -2D"+"\n"+"Recliner"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				default:
					{
					System.out.println("Tickets not not available");
					}
				}
			}		
		case 2:
			{
			int seat, qty;
			System.out.println("**WELCOME TO PVR CINEMAS**");
			System.out.println("KGF 2 - 2D");
			System.out.println("SELECT SEATTING AREA'S");
			System.out.println("1.BALCONY");
			System.out.println("2.RECLINER");
			seat=s1.nextInt();	
			switch(seat)
				{
				case 1:
					{
					System.out.println("BALCONY");
					double rate =100;
					System.out.println("Enter No. of tickets: ");
					qty=s1.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("PVR CINEMAS"+"\n"+"KGF 2 -2D"+"\n"+"Balcony"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				case 2:
					{
					System.out.println("RECLINER");
					double rate =150;
					System.out.println("Enter No. of tickets: ");
					qty=s1.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("PVR CINEMAS"+"\n"+"KGF 2 -2D"+"\n"+"Recliner"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				default:
					{
					System.out.println("Tickets not not available");
					}
				}		
				
			}
		}
	}
}

class INOX implements Movie
{
	public void selectMovie()
	{
	java.util.Scanner s1=new java.util.Scanner(System.in);
	int screen1;
	System.out.println("***WELCOME TO INOX CINEMAS***");
	System.out.println("SELECT SCREEN-1: DOCTOR STRANGE - 3D");
	System.out.println("SELECT SCREEN-2: VIKRAM - 2D");
	screen1=s1.nextInt();
	switch(screen1)
		{
		case 1:
			{
			int seat, qty;
			System.out.println("**WELCOME TO INOX CINEMAS**");
			System.out.println("DOCTOR STRANGE - 3D");
			System.out.println("SELECT SEATTING AREA'S");
			System.out.println("1.BALCONY");
			System.out.println("2.RECLINER");
			seat=s1.nextInt();	
			switch(seat)
				{
				case 1:
					{
					System.out.println("BALCONY");
					double rate =100;
					System.out.println("Enter No. of tickets: ");
					qty=s1.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("INOX CINEMAS"+"\n"+"DOCTOR STRANGE -3D"+"\n"+"Balcony"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				case 2:
					{
					System.out.println("RECLINER");
					double rate =150;
					System.out.println("Enter No. of tickets: ");
					qty=s1.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("INOX CINEMAS"+"\n"+"DOCTOR STRANGE -3D"+"\n"+"Recliner"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				default:
					{
					System.out.println("Tickets not not available");
					}
				}
			}		
		case 2:
			{
			int seat, qty;
			System.out.println("**WELCOME TO INOX CINEMAS**");
			System.out.println("VIKRAM - 2D");
			System.out.println("SELECT SEATTING AREA'S");
			System.out.println("1.BALCONY");
			System.out.println("2.RECLINER");
			seat=s1.nextInt();	
			switch(seat)
				{
				case 1:
					{
					System.out.println("BALCONY");
					double rate =100;
					System.out.println("Enter No. of tickets: ");
					qty=s1.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("INOX CINEMAS"+"\n"+"VIKRAM -2D"+"\n"+"Balcony"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				case 2:
					{
					System.out.println("RECLINER");
					double rate =150;
					System.out.println("Enter No. of tickets: ");
					qty=s1.nextInt();
					double tot_rate = rate * qty;
					double GST_18= tot_rate*0.18;
					double amount =tot_rate  + GST_18;
					System.out.println("INOX CINEMAS"+"\n"+"VIKRAM -2D"+"\n"+"Recliner"+
					"\n"+"Ticket rate: "+rate +"\n"+"No. of Tickets: "+qty +"\n"+"Total ticket rate: "+tot_rate +"\n"+"GST 18%: "+GST_18 + "\n"+
					"Total Tickets Amount: "+amount);
					break;	
					}
				default:
					{
					System.out.println("Tickets not not available");
					}
				}		
				
			}
		}
	}
}

class ServiceProvider
/*
{
public Movie bookMyShow(int select)
	{
	if(select==1)
		{
		return new IMAX();
		}
	else if(select==2)
		{
		return new PVR();
		}
	else if(select==3)
		{
		return new INOX();
		}
	else
		{
		return null;
		}
	}	
}
*/
{
public Movie justickets(int select)
	{
	if(select == 1)
		{
		return new IMAX();
		}
	else if(select == 2)
		{
		return new PVR();
		}
	else if(select == 3)
		{
		return new INOX();
		}
	else
		{
		return null;
		}
	}
}

class Hideobj
{
public static void main(String[]args)
	{
	try
		{
		ServiceProvider sp=new ServiceProvider();
		int select;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Available Theatres: "+"\n"+ "1. IMAX"+ "\n"+"2. PVR"+"\n" +"3. INOX"+"\n"+"Select Theatre");
		select =sc.nextInt();
		Movie m=sp.justickets(select);
		m.selectMovie();
		}
	catch(NullPointerException e)
		{
		System.out.println("Please Enter Available Theatres");
		}


/*	ServiceProvider sp=new ServiceProvider();
	int select;
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Available Theatre's: "+"\n"+"1. IMAX"+"\n"+"2. PVR"+"\n"+"3. INOX"+"\n"+"Select Theatre");
	select = sc.nextInt();
	Movie m=sp.bookMyShow(select);
	m.selectMovie();	*/

/*	Movie m=new IMAX();
	m.selectMovie();
	Movie m2=new PVR();
	m2.selectMovie();	
	Movie m3=new INOX();
	m3.selectMovie();	*/
	}
}