//HashSet Example 
package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
	public static void main(String args[])
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		System.out.println(hs);
/*		for(String s:hs)
		{
			System.out.println(s);
		}*/
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
