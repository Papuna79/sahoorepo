//TreeMap Example 
package Collection;

import java.util.Map;
import java.util.TreeMap;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1,"hns");
		tm.put(2,"hds");
		tm.put(3,"ccss");
		System.out.println(tm); 
		for(Map.Entry m:tm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
