package final_test;

public class FinalizeTest {
	
	public void finalize(){
		System.out.println("Finalize call");
	}

	public static void main(String[] args) {
		FinalizeTest f1=new FinalizeTest();
		FinalizeTest f2=new FinalizeTest();
		
		f1=null;
		f2=null;
		
		System.gc();
	}

}
