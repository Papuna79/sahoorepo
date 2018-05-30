//LinkedList Example 
package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test1 {
	public static void main(String args[])
	{
		LinkedList<String> al=new LinkedList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al);
/*		//traversing through list by using Iterator
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	*/
/*	//traversing through for each loop 
		for(String s:al)
		{
			System.out.println(s);
		}*/
	//by using ListIterator
		ListIterator<String> itr=al.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}


}
