package throws_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ThrowsTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		readFile();
	}
	
	public static void readFile() throws IOException, InterruptedException{
		File f=new File(" ");
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop=new Properties();
		prop.load(fis);
		Thread.sleep(1000);
	}

}
