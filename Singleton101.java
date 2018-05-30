package syntel.in;

public class Singleton101 {
	private static Singleton101 obj=null;
	private Singleton101()
	{}
	public static Singleton101 getSingleton()
	{
		if(obj==null)
		{
			obj=new Singleton101();
		}
		return obj;
	}

}
