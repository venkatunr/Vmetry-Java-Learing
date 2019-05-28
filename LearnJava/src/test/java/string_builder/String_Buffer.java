package string_builder;

public class String_Buffer {

	public static void main(String[] args) {
		String input="vmetry";
		input.concat("Technologies");
		System.out.println(input);
		
		StringBuffer sb=new StringBuffer("Vmetry");
		sb.append("Tech");
		
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("Vmetry");
		sb1.append("solution");
		System.out.println(sb1);
	}

}
