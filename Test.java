//ArrayList Example 
package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println("the list is :"+al);/*
		//Traverseing through ArrayList by using Iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		//Travers using foreach loop
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
