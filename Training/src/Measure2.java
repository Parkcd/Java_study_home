import java.util.Scanner;
public class Measure2 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a = c.nextInt();
		int b = c.nextInt();
		
		if(!(a%b==0)) {
			System.out.println(b + "는" + a + "의 약수가 아닙니다.");
		}
		else {
			System.out.println(b + "는" + a + "의 약수 입니다.");
		}
		

	}

}
