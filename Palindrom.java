package syntel.in;

import java.util.Scanner;

public class Palindrom {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.nextLine();
		String rev="";
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse "+rev);
		if (s.equals(rev))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not a palindrom ");
		}
	}

}
