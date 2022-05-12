import java.util.Scanner;
public class Diff2B {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int a = c.nextInt();
		int b = c.nextInt();
		int diff = a>=b ? a-b : b-a;
		
		System.out.println("두 값의 차는"+ diff + "입니다.");
	}

}
