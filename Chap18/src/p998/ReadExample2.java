package p998;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception{
		
		InputStream is = new FileInputStream("c:/Temp/test.txt");
		int readByteNo;
		byte[]readBytes = new byte[3];
		String data = "";
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			data += new String(readBytes , 0 , readByteNo);
		}
		System.out.println(data);
		is.close();
	}

}
