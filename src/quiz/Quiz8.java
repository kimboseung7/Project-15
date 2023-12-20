package quiz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz8 {
	FileOutputStream a;

	public static void main(String[] args) throws IOException {
		File fi = new File("C:\\Users\\user\\Downloads");
		File[] files =	fi.listFiles();
		
		FileWriter fii = new FileWriter("Quiz8.txt");
		for(File file : files) {
			System.out.println(file);
			fii.write(file.getName() + "\n");
		}
		fii.close(); //닫아줘야지 데이터가 올바르게 기록
	}
	
}
