//HashTable Example 
package Collection;

import java.util.Hashtable;
import java.util.Map;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1,"a");
		ht.put(2,"b");
		ht.put(3,"c");
		System.out.println(ht);
		for(Map.Entry m:ht.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
		

	}

}
