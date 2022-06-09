import java.util.Scanner;
public class beforeafter {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("숫자1를 입력하세요");
		int a = stdIn.nextInt();
		
		System.out.println("숫자2를 입력하세요");
		int b = stdIn.nextInt();
		
		System.out.println("증감연산자 step1");
		System.out.println("전위증가연산자 :" + ++a + " " + "후위증가연산자 :" + b++ );
		
		System.out.println("증감연산자 step2");
		System.out.println("전위증가연산자 :" + ++a + " " + "후위증가연산자 :" + b++ );
		
		System.out.println("증감연산자 step3");
		System.out.println("전위감소연산자 :" + --a + " " + "후위감소연산자 :" + b-- );
		
		System.out.println("증감연산자 step4");
		System.out.println("전위감소연산자 :" + --a + " " + "후위감소연산자 :" + b-- );
		

		
		
	}

}
