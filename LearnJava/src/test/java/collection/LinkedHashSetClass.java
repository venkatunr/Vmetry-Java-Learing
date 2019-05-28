package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		LinkedHashSet<String> ts=new LinkedHashSet<String>();
		ts.add("asas");
		ts.add("asas");
		ts.add("asa");
		ts.add("as");
		ts.add("asaaaaaa");
		
		Iterator<String> it=ts.iterator();
		while(it.hasNext())
		{
		String str=it.next();	
		System.out.println(str);
		}

	}

}
