import java.util.Scanner;
public class Diff2Digits1 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a = c.nextInt();
		int b = c.nextInt();
		
		int diff = a >= b ? a-b : b-a;
		if(diff <= 10) {
			System.out.println("두 값의 차는 10이하 입니다.");
		}
		else if(diff > 10) {
			System.out.println("두 값의 차는 11이상 입니다.");
		}

	}

}
