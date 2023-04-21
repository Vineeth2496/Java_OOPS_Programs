class Development
{
	private String Ph_No;
	private String chat;

	public Development(String Ph_No, String chat)
	{
	this.Ph_No=Ph_No;
	this.chat=chat;
	}
	public void WhatsApp()
	{
	System.out.println("WELCOME TO WHATSAPP");
	System.out.println("Your phone number is: "+Ph_No);
	System.out.println("Your chat box is: "+chat);
	}
	public void WhatsApp(String...call)
	{
	int count=0;
		for(String x:call)
		{
		count++;
		}
	System.out.println("WhatsApp is updated with group call and count: "+count);
	}	

}

class Overloading
{
public static void main(String[]args)
	{
	Development d=new Development("9440169218","Hi darling, how are you doing");
	d.WhatsApp();
	d.WhatsApp("9177683976","8500801518");
	}
}