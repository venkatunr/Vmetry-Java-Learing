package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {

		LinkedList ll=new LinkedList();
		ll.add(null);
		ll.add("sas");
		ll.add("sa");
		ll.add("ss");
		ll.add("as");
		ll.add("s");
		ll.add("s");
		ll.add(null);
		ll.add(null);
		
		Iterator<String> it=ll.iterator();
		
		while(it.hasNext()){
		String str=	(String) it.next();
		System.out.println(str);
		}
	
	}
}
