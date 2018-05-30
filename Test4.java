//LinkedHashSet Example
package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test4 {
	public static void main(String args[])
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		System.out.println(lhs);
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
