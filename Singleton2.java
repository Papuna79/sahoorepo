package syntel.in;

public class Singleton2 {
private static Singleton2 obj=null;
private Singleton2()
{}
public static Singleton2 getSingleton2()
{
	
	if (obj==null)
	{
		synchronized(Singleton.class)
		{
			if(obj==null)
			{
				obj=new Singleton2();
			}
		}
		
	}
		return obj;}
}
