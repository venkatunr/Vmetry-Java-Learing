package string_programs;

public class LargestAndSmallets {

	public static void largeAndSmall(int i){
		
	}
	public static void main(String[] args) {
	
		int[] number={ 123, 432,231,67,9864,11,21,43};
		int largest =number[0];
		int smaller =number[0];
		
		for(int i=0;i<number.length;i++){
			
			if(number[i]>largest){
				largest=number[i];	
			}
			else if(number[i]<smaller){
				smaller=number[i];
			}
			
		}
		System.out.println("Largest number in the given array =>" +largest);
		System.out.println("Smaller number in the given array =>" +smaller);
		System.out.println();

	}

}
