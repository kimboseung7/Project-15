package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;

		// 입출력 스트림 생성
		FileInputStream fis;
		try {
			fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("copy.txt");

			// 버퍼링 보조스트림 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			// 복사 시간 측정하기
			start = System.currentTimeMillis();

			while(true) {
				int i = bis.read();
				if(i == -1) {
					break;
				}
				bos.write(i);
			}
			end = System.currentTimeMillis();
			System.out.println("파일 복사하는데 " + (end - start) + "ms 소요되었습니다");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
