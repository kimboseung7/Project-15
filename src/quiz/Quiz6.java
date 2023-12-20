package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz6 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("qwer.txt");
		for (int i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				fw.write(i + "x" + j + "=" + i * j + "\n");
			}
			fw.write("\n");
		}
		fw.flush();
	}

}
