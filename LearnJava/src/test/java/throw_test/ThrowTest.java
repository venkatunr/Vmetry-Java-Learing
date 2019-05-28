package throw_test;

public class ThrowTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int age=17;
		
		if(age<18){
			System.out.println("under 18");
			
			throw new Exception("Dont allow if age is under 18");
		//	System.out.println();//throw already shown exception
			
		}
		System.out.println("Allow to vote");
	}

}
