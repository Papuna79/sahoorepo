package syntel.in;

public class Stringrevcmd {
public static void main(String args[])
{
	String s=args[0];
	System.out.println("Enter the String :");
	String rev=new StringBuffer(s).reverse().toString();
	System.out.println("the reverse of the String is :"+rev);
	}
}
