import java.util.Scanner;
public class Balance {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.println("2개의 변수를 입력하세요.");
		System.out.println("변수1 =");
		int a = c.nextInt();
		System.out.println("변수2 =");
		int b = c.nextInt();
		
		if(a>b) {
			System.out.println(a + "는" + b + "보다 큽니다");
		}
		else if(b>a) {
			System.out.println(b + "는" + a + "보다 큽니다");
		}
		else {
			System.out.println(a+ "와" + b +"는 같습니다.");
		}
		
		

	}

}
