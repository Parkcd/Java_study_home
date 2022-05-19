package p1001;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("c:/Temp/test.txt");
		byte[] data = "ABCD".getBytes();	
		os.write(data , 1 , 2);  // 1은 위치고 2는 갯수임
		os.flush();
		os.close();

	}

}
