//TreeSet
package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Test5 {
	public static void main(String args[])
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("abc");
		ts.add("pqr");
		ts.add("xyz");
		System.out.println(ts);
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
