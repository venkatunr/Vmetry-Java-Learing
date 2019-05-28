package string_programs;

public class UppertoLowercaseTest {
	
	public static void setup(String str){
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++){
		char data=ch[i];
		String value=data+"";
		
		if(i%2==0){
			System.out.print(value.toUpperCase());
		}
		else if(i%2!=0){
			System.out.print(value.toLowerCase());
		}
		
		}
	}

	public static void main(String[] args) {
	
		setup("Venkateshkumar");
	}

}
