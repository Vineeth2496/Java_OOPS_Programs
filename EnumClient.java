enum calenderApp
{
january ,february, march, april, may, june, july, august, september, october, november, december
}

class EnumClient
{
public static void main(String[]args)
	{
	calenderApp c[]=calenderApp.values();
	for(calenderApp x:c)
		{
		System.out.println("Enum month are: "+x);
		}
	}
}