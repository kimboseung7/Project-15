package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex11 {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		
		
		// 입출력 스트림 생성
		try {
			FileInputStream fis = new FileInputStream("a.txt");

			FileOutputStream fos = new FileOutputStream("copy.txt");
			
			//복사를 시작하는 시간
			start = System.currentTimeMillis();
			
			System.out.println(start);
			//한문자씩 읽어서 복사하는 중
//			while(true) {
//				int i = fis.read();
//				if(i== -1) {
//					break;
//				}
//				fos.write(i);
//			}
			//복사가 끝나는 시간
			end = System.currentTimeMillis();
			System.out.println("파일 복사하는데 " + (end - start) + "ms 소요되었습니다");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
