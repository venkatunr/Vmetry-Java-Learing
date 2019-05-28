package file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileHandling {

	public static void main(String[] args) throws IOException{
		
		File f=new File("D:\\Vmetry\\LearnJava\\File\\Text.txt");
		
		if(!f.exists()){
			f.createNewFile();
		}
	//1) String Test:
		
		FileWriter fw=new FileWriter(f,true); // True is used to don't remove the exsiting written value in notepad.
		
//		fw.write("syncfusion");
//		fw.write("Software");
//		fw.write("private");
//		fw.close();
		
		
		//BufferedWritter to write the value in next line. for above case it will now work.there is not newLine()Method avalible
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("syncfusion");
		bw.newLine();
		bw.write("Software");
		bw.newLine();
		bw.write("private");
		bw.newLine();
		bw.write("Limited");
		bw.newLine();
		bw.close();

		//2)Numeric Write Test
		
		FileWriter fw1=new FileWriter(f,true); // True is used to don't remove the exsiting written value in notepad.

		BufferedWriter bw1=new BufferedWriter(fw1);
		
		//We will get incorret number format for below code 
//		bw1.write(1);
//		bw1.newLine();
//		bw1.write(2);
//		bw1.newLine();
//		bw1.write(3);
//		bw1.newLine();
//		bw1.close();
		
		//To overcome above use we need to use below code
		bw1.write(""+1);
		bw1.newLine();
		bw1.write(""+2);
		bw1.newLine();
		bw1.write(""+3);
		bw1.newLine();
		bw1.close();
		
		//3) To read the value from Text file we use FileReader and BufferedReader. refer below code.
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		br.close();

	}
}
