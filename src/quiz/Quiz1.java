package quiz;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("xsad.txt");
		for(int i = 1; i<=10; i++) {
			if(i%2 == 0) {
				fw.write(i + " "); //문자로 형변환
			}
			fw.write("\n");
		}
		fw.flush();
	}

}
