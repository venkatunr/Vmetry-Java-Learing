package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass {
//
	//HashSet doesn’t maintain any order, the elements would be returned in any random order.
	//HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
	//HashSet allows null values however if you insert more than one nulls it would still return only one null value.
	//HashSet is non-synchronized.
	//
	
	public static void main(String[] args) {
		
	Set<String> set=new HashSet<String>();
	set.add("qwer");
	set.add("er");
	set.add("abcd");
	set.add("bcd");
	
	
	Iterator<String> it=set.iterator();
	while(it.hasNext())
	{
	String str=it.next();	
	System.out.println(str);
	
	}
	}

}
