package exception_handling;

public class TryCatchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception Handling Test Initiated");
		try
		{
			int[] a=new int[3];
			a[0]=10;
			a[1]=20;
			a[2]=30;
			
			int i=1/0;
		}
		catch(Exception e){
			System.out.println("Sorry,something went Wrong"+ e.getMessage());
		}
		System.out.println("Exception Hanling Test Completed");
	}
	}


