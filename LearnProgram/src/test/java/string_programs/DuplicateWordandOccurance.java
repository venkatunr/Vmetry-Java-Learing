package string_programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWordandOccurance {

	public static void doublicateWord(String inputstring){
	
	String[] words=inputstring.split(" ");
	
	HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	
	for (String iword : words) {
		if(hmap.containsKey(iword)){
		hmap.put(iword, hmap.get(iword)+1);	
		System.out.println(hmap + "if part");
		}
		else{
			hmap.put(iword, 1);
			//System.out.println(hmap +"else part");
		}
		}
	
	Set<String> set=hmap.keySet();
	for (String string : set) {
		if(hmap.get(string)>1)
		System.out.println(string + "===>" + hmap.get(string));
	}	
	}

	public static void main(String[] args) {
		doublicateWord("Super Man Bat Man Spider Man");
		//doublicateWord("Bread butter and Bread");
	}

	public static void doublicateWord1(String inputstring){
	  int count;   
	  String[] words=inputstring.split(" ");
        
      System.out.println("Duplicate words in a given string : ");   
      for(int i = 0; i < words.length; i++) {  
          count = 1;  
          for(int j = i+1; j < words.length; j++) {  
              if(words[i].equals(words[j])) {  
                  count++;  
                  //Set words[j] to 0 to avoid printing visited word  
                  words[j] = "0";  
              }  
          }  
          //Displays the duplicate word if count is greater than 1  
          if(count > 1 && words[i] != "0")  
              System.out.println(words[i]+ ":" +count);  
      }  
	}
	
}