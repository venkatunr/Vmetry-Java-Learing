package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {

	
	public static void main(String[] args) {
	
		HashMap<Character,String> hm=new HashMap<Character,String>();
		
		hm.put('e', "Syncfusion");
		hm.put('c', "Software");
		hm.put('d', "Private");
		hm.put('b', "Limited");
		
	
		hm.put(null, "d");
		hm.put(null, "asdsd");
		hm.put(null, "d");
		
		Set<Character> st=hm.keySet();
		Iterator<Character> it=st.iterator();
				while(it.hasNext()){
					Character str=it.next();
					System.out.println(str +"==>"+ hm.get(str));
				}
	}

}
