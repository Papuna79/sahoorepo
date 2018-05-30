package syntel.in;

public class Singleton102 {
	private static Singleton102 obj=new Singleton102();
	private Singleton102()
	{}
	public static Singleton102 getSingleton102()
	{
		
		return obj;
	}

}
