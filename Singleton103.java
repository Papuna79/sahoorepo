package syntel.in;

public class Singleton103 {
	private static Singleton103 obj=null;
	private Singleton103()
	{}
	public static Singleton103 getSingleton103()
	{
		if(obj==null)
		{
			synchronized(Singleton.class)
			{
				if(obj==null)
				{
					obj=new Singleton103();
				}
			}
		}
		return obj;
	}

}
