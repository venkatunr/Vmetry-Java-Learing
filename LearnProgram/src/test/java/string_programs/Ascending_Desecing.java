package string_programs;

import java.util.Scanner;

public class Ascending_Desecing {

	public static void main(String[] args) {
		int number[]={212,3121,312434,567,788,97,4,37,55};
		int temp,a;
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number" );
//		a=sc.nextInt();
//		
//		int number[]=new int[a];
//		
//		System.out.println("Enter all the elements:");
//		for (int i = 0; i < a; i++) 
//		{
//			number[i] = sc.nextInt();
//		}
		
		for(int i=0;i<number.length;i++){
			for(int j=i+1;j<number.length;j++){
				if(number[i]>number[j]){
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
			System.out.print(number[i] +" ");
		}
		System.out.println();
		
		
		for(int i=0;i<number.length;i++){
			for(int j=i+1;j<number.length;j++){
				if(number[i]<number[j]){
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		
			System.out.print(number[i] +" ");
		}
	}

}
