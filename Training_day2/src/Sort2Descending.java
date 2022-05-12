import java.util.Scanner;
public class Sort2Descending {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.println("두가지 정수를 입력하세요");
		int a = c.nextInt();
		System.out.println("두가지 정수를 입력하세요");
		int b = c.nextInt();
		
		if(a>b) {
			int t =a;
			a = b;
			b = t;
		}
			System.out.println("a>=b가 되도록 정렬했습니다");
			System.out.println("변수 a는" + a + "입니다.");
			System.out.println("변수 b는" + b + "입니다.");
			
		}
		
	}


