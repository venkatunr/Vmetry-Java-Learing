package string_programs;

public class ReverseStringprog {

	public static void getstr(String str){
		char ch[]=str.toCharArray();
		int ln=str.length();
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}
	
	public static void main(String[] args) {
		
		getstr("venkat");
	}

}
