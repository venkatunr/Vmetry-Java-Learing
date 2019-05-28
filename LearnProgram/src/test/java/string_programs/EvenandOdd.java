package string_programs;

public class EvenandOdd {

	public static void main(String[] args) {
	
		int number[]={ 12, 32,423,5423,767,90,766,88};
		
		System.out.print("Odd numbers in the array are : ");
		for(int i=0;i<number.length;i++){
			if(number[i]%2 != 0){
				System.out.print(number[i] + " ");
			}
			
			
		}
		
	}

}
