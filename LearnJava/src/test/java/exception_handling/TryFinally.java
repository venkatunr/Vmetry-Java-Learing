package exception_handling;

public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception Handling Test Initiated");
		try
		{
			int i=1/0;
		}
		
		finally{
			System.out.println("LogOutDB");
		}
		System.out.println("Exception Hanling Test Completed");

	
	}

}