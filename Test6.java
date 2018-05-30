//HashMap Example 
package Collection;

import java.util.HashMap;
import java.util.Map;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		System.out.println(map);
		//traversing through map 
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		

	}

}
