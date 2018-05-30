package syntel.in;

public class Singleton {
	private static Singleton obj=null;
	private Singleton()
	{}
	public static Singleton getSingleton()
	{
		if(obj==null)
		{
			obj=new Singleton();
		}
		return obj;}

}
