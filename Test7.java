//LinkedHashMap
package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
    lhm.put(1,"abc");
    lhm.put(2,"pqr");
    lhm.put(3,"xyz");
    System.out.println(lhm);
    for(Map.Entry m:lhm.entrySet())
    {
    	System.out.println(m.getKey()+" "+m.getValue());
    }
	}

}
