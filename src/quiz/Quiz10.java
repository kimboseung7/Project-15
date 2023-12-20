package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz10 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\KimBoseung\\workspace\\java-study\\Project02\\src";
		FileWriter fii = new FileWriter("Quiz10.txt");

		printFileList(path, fii);
		fii.close();
	}

	private static void printFileList(String path, FileWriter fii) throws IOException {
		File dir = new File(path);
		File[] files = dir.listFiles(); 
		
		
		for(int i =0; i<files.length; i++) { //파일을 파일의 배열만큼 점점 증가시켜서 출력
			if(files[i].isFile()) { //배열의 인덱스가 파일이면 출력
				
				fii.write("  " + files[i].getName() + "\n");
				
			}
			 else if( files[i].isDirectory() ) {  //폴더면 재귀함수(printFileList)를 호출 다시 파일을 찾아 출력
				 
				 fii.write( "\n" + "------------------" +" "+ files[i].getName()+ "\n");
				 
	              printFileList(files[i].getPath(), fii);
	         
	            } 

		}
	}

}
