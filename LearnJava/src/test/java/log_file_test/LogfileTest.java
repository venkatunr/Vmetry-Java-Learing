package log_file_test;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogfileTest {

	public static Logger log=LoggerFactory.getLogger(LogfileTest.class);
	
	
	public static void main(String[] args) {
	
		PropertyConfigurator.configure("D:\\Vmetry\\LearnJava\\lib\\log4j.properties");
		log.info("I am first INFO");
		log.error("I am Second Error");
		
	}
}
