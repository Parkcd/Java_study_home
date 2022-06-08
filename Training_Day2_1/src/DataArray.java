import java.util.Scanner;
public class DataArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("byte 타입 값 입력:");
		int a = stdIn.nextInt();
		
		if(a>Byte.MAX_VALUE) {
			System.out.println("Byte 타입을 충족하지 않습니다");
		}
		
		else if(a<Byte.MIN_VALUE) {
			System.out.println("Byte 타입을 충족하지 않습니다");
		}
		
		else {
			System.out.println(a);
		}
			
		System.out.println("Short 타입 값 입력:");
		long b = stdIn.nextInt();
		
		if(b>Short.MAX_VALUE) {
			System.out.println("Short 타입을 충족하지 않습니다");
		}
		
		else if(a<Short.MIN_VALUE) {
			System.out.println("Short 타입을 충족하지 않습니다");
		}
		
		else {
			System.out.println(b);
		}
		
		System.out.println("Int 타입 값 입력:");
		long c = stdIn.nextLong();
		
		if(c>Integer.MAX_VALUE) {
			System.out.println("Integer 타입을 충족하지 않습니다");
		}
		
		else if(c<Integer.MIN_VALUE) {
			System.out.println("Integer 타입을 충족하지 않습니다");
		}
		
		else {
			System.out.println(c);
		}
		
		System.out.println("Long 타입 값 입력:");
		long d = stdIn.nextLong();
		
		if(d>Long.MAX_VALUE) {
			System.out.println("Long 타입을 충족하지 않습니다");
		}
		
		else if(d<Long.MIN_VALUE) {
			System.out.println("Long 타입을 충족하지 않습니다");
		}
		
		else {
			System.out.println(d);
		}
		
		
		System.out.println("Char 타입 값 입력:");
		char e = stdIn.next().charAt(0);
		
		if(e<0) {
			System.out.println("Char 타입을 충족하지 않습니다");
		}
		
		else if(e>65535) {
			System.out.println("Char 타입을 충족하지 않습니다");
		}
		
		else {
			System.out.println(e);
		}
		
	}

}
