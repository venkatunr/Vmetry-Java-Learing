package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesFileHandling {

	public static void main(String[] args) throws IOException {
		//Read the values from Properties file( 99% we are using only read option not write option) knowledge point of view we can know write opration.
		
		File f=new File("D:\\Vmetry\\LearnJava\\File\\config.Properties");
		if(!f.exists()){
			f.createNewFile();
		}
		FileInputStream fis=new FileInputStream(f);//convert as input stream
		
		Properties prop=new Properties();//Utill package => There is two team working on this (IO nd Util Package) so can't pass the "fis" value in construtor in this line)
		// so need to write in next lines
		prop.load(fis);
		
		Enumeration e=prop.keys();
		while(e.hasMoreElements()){
			String key=(String) e.nextElement();
			System.out.println(key+ "===>" + prop.get(key));	
		}
		
		
		
	}
}
