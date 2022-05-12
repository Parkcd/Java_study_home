import java.util.Scanner;
public class BalanceWrong {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.println("2개의 변수를 입력하세요.");
		System.out.println("변수1 =");
		int a = c.nextInt();
		System.out.println("변수2 =");
		int b = c.nextInt();
		
		int diff = a-b;
		if(diff > 0) {
			System.out.println(a + "는" + b + "보다 큽니다");
		}
		else if(diff <0) {
			System.out.println(b + "는" + a + "보다 큽니다");
		}
		else {
			System.out.println(a+ "와" + b +"는 같습니다.");
		}
		
		

	}

}
