package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapClass {

	public static void main(String[] args) {
	LinkedHashMap lhm=new LinkedHashMap();
	
	lhm.put("ng", "value");
	lhm.put("string", "value");
	lhm.put("tring", "value");
	lhm.put("ring", "value");
	lhm.put("n", "value");
	lhm.put(null, "asdsd");
	lhm.put(null, "sdsd");
	
	Iterator<String> it=lhm.keySet().iterator();
	while(it.hasNext()){
		String str=it.next();
		System.out.println(str +"==>"+ lhm.get(str));
	}
}
}

