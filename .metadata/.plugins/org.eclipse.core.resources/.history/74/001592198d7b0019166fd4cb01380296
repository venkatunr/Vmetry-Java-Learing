package string_programs;

public class DuplicateChar {

	public static void main(String[] args) {
		dupchar("asyhasdaldasjvca");
	}

	public static void dupchar(String inputString){
		char[] ch=inputString.toCharArray();
		int len=ch.length;
		int count;
		
		for(int i=0;i<len;i++){
			 count=1;
			for(int j=i+1;j<len;j++){
				if(ch[i]==ch[j]){
					count++;
					ch[j]='0';
				}
			}
			if(count>1 && ch[i]!='0'){
				System.out.println(ch[i] + " ====>"+ count);
			}
		}
		
		
	}
	
}
