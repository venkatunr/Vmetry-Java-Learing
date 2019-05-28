package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListClass {
	
	//TO overcome issues from array,Collection option is created 
	//issues in Array
			//1)Size is fixed 
			//2)Similar data types only allows in Array
			//3)There will be memmory westage issue.if we allocated memmory as 100 value and assignes value is only 10 and there will be memory occupied for remaining 90 values 
	
	//Overcome in ArrayList
		//1)Memory will be created whenever we add the values in arraylist.
		//2)We can add n number of values 
		//3)It will allow all datatypes in the form of non Generics.

	//but we have some issues in Arraylist also.
	//advantage:
		//1) Fetching the element will be faster.
	//disadvange
		//	2)Insertion and deletion will be slower. if we insert value in between the list it should reassign the index for all values. so it will take much time.
	
	
//Defination in technical point :
	
	//1)An ArrayList is a dynamic array.It grows its size to accommodate new elements and shrinks the size when the elements are removed.
	//2)Java ArrayList allows duplicate and null values.
	//3)Java ArrayList is an ordered collection. It maintains the insertion order of the elements
	//4)Java ArrayList is not synchronized. If multiple threads try to modify an ArrayList at the same time, then the final outcome will be non-deterministic. 

	public static void main(String[] args) {
		ArrayList<String> alc=new ArrayList<String> ();

		alc.add("asdfs");
		alc.add("asasa");
		alc.add("1243");
		alc.add("asd");
		alc.add("1243");
		alc.add(null);
		alc.add(null);
		alc.add(null);
		
		System.out.println(alc);
		int len=alc.size();
		for(int i=0;i<len;i++){
			System.out.println(alc.get(i));
		}
		Collections.sort(alc);
		System.out.println(alc);
		

	}

}
