package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz9 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\user\\Downloads";
		String path2 = "C:\\Users\\user\\Downloads\\source";
		FileWriter fii = new FileWriter("Quiz9.txt");

		printFileList(path2, fii); // 인자를 각각 전달
	}

	private static void printFileList(String path, FileWriter fii) throws IOException { //문자열 하나 //출력 스트림 하나
		
		File dir = new File(path);
		File[] files = dir.listFiles(); // 폴더 밑에 있는 파일 목록
		
		
		for (File file : files) {
			System.out.println(file);
			fii.write(file.getName() + "\n");
		}
		fii.close(); // 닫아줘야지 데이터가 올바르게 기록
	}

}
