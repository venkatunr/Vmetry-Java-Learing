package exception_handling;

public class Finally_Test {

	public static void main(String[] args) {
		System.out.println("Exception Handling Test Initiated");
		try
		{
			int i=1/1;
		}
		
		catch(ArithmeticException e){
			System.out.println("alert :Your Input is Wrong"+ e.getMessage());
		}
		finally{
			System.out.println("LogOutDB");
		}
		System.out.println("Exception Hanling Test Completed");

	}

}
