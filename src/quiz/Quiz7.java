package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz7 {

	public static void main(String[] args) {
		FileOutputStream a;
		try {
			a = new FileOutputStream("out.txt");
			OutputStreamWriter b = new OutputStreamWriter(a);
			//보조스트림은 혼자생선이 안되기때문에 new 인자에 기반스트림을 입력한다

			b.write("프");
			b.write("로");
			b.write("그");
			b.write("래");
			b.write("밍");
			
			b.flush();
			
		} catch (IOException e) {
			// TOD O Auto-generated catch block
			e.printStackTrace();
		}

	}

}
