import java.util.Scanner;
public class Diff2A {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int a = c.nextInt();
		int b = c.nextInt();
		int diff;
		
		if(a>b) {
			diff = a-b;
		}
		else {
			diff = b-a;
		}
		System.out.println("두값의 차이는" + diff + "입니다." );
	}
         
}
