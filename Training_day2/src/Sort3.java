import java.util.Scanner;
public class Sort3 {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		
		System.out.println("정수 a:");
		int a = d.nextInt();
		System.out.println("정수 b:");
		int b = d.nextInt();
		System.out.println("정수 c:");
		int c = d.nextInt();

		if (a>b) {
			int t = a;
			a=b;
			b=t;
		}
		if (b>c) {
			int t = b;
			b=c;
			c=t;
		}
		if (a>b) {
			int t = a;
			a=b;
			b=t;
		}
		System.out.println("a≤b≤c가 되도록 정렬 했습니다");
		System.out.println("변수 a는 " + a + "입니다.");
		System.out.println("변수 b는 " + b + "입니다.");
		System.out.println("변수 c는 " + c + "입니다.");
		
	}

}
