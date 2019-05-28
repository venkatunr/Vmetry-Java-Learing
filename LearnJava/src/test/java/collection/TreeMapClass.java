package collection;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("s", "venkat");
		tm.put("x", "venkat");
		tm.put("y", "venkat");
		tm.put("e", "23");
		tm.put("r", "chennai");
		tm.put("d", null);
		tm.put("u", null);
		
		
		Iterator<String> it=tm.keySet().iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str +"==>"+ tm.get(str));
		}
	}

}
