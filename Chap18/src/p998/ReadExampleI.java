package p998;

import java.io.FileInputStream;
import java.io.InputStream;



public class ReadExampleI {
	public static void main(String[] args) throws Exception{

	InputStream is = new FileInputStream("c:/temp/test.txt");

	int readByte;

	while(true) {

	readByte = is.read();

	if(readByte == -1) break;

	System.out.print((char)readByte);

	}

	is.close();  // 파일은 반드시 열었다가 닫아줘야함

	}

}