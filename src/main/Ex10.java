package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {

	public static void main(String[] args) {
		// 기반 스트림 생성
		FileInputStream fis;
		try {

			// 보조 스트림으로 내용 읽기
			fis = new FileInputStream("reader.txt");
			// 보조 스트림 생성
			InputStreamReader isr = new InputStreamReader(fis);

			while (true) {
				int i = isr.read(); // 바이트 읽은 내용을 문자로 변환하여
				if (i == -1) {
					break;
				}
				System.out.println((char) i); // 한글을 제대로 읽음
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
