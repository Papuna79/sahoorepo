package syntel.in;

public final class Immutable {
	private int i;
	Immutable(int i)
	{
		this.i=i;
	}
	public Immutable modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return new Immutable(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immutable obj=new Immutable(10);
		Immutable obj1=obj.modify(12);
		Immutable obj2=obj.modify(10);
		System.out.println(obj==obj1);
		System.out.println(obj==obj2);
	}

}
