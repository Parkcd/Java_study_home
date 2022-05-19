package p1004;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("c:/Temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[4];
		readCharNo = reader.read(cbuf , 1 ,2);
		for(int i=0; i<cbuf.length ; i++) {
			System.out.print(cbuf[i]);
		}
		reader.close();

	}

}
