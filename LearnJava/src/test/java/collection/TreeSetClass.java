package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("asas");
		ts.add("asas");
		ts.add("asa");
		ts.add("as");
		ts.add(null);
		Iterator<String> it=ts.iterator();
		while(it.hasNext())
		{
		String str=it.next();	
		System.out.println(str);
		}
	}

}
