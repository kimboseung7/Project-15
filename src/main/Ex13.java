package main;

import java.io.File;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) {
		
		File dir = new File("C:\\Users\\user\\Downloads");
		
		File[] files = dir.listFiles();
		
		for(File file : files) {
			System.out.println(file.delete());
		}
		// File: 파일 정보를 담는 클래스.
		// 파일의 경로, 크기 등 정보를 확인하거나 파일을 생성할 수 있음
		// newFile.txt와 연결된 파일 클래스 생성
		
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//파일 속성 보기
//		System.out.println( file.isFile());//파일인지?
//		System.out.println(file.isDirectory()); //폴더인지?
//		System.out.println(file.getName());//파일이름
//		System.out.println(file.getAbsolutePath()); //파일경로
//		System.out.println(file.canRead()); //읽을 수 있는지?
//		System.out.println(file.canExecute()); //쓸 수 있는지
		
		//파일 삭제
//		file.delete();
		
	}

}
