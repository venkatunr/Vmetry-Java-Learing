package string_array_test;

public class String_Array_class {

	public static void main(String[] args) {
		String x="Hello Vmetry Hello Vcentry Hello Vtrisys";
		String names[]=x.split(" ");
		int len=names.length;
		
		int count=0;
		
		for(int i=0;i<len;i++){
			
			String data=names[i];
			
			if(data.equals("Hello")){
				
					count++;
			
			}
			
		}
		System.out.println(count);
		
	}

}
