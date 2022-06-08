import java.util.Scanner;
public class yoonyear {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요");
		int a = stdIn.nextInt();
		
		if(a%4==0) {
			System.out.println("짝수,윤년 입니다.");
		}
		
		else if(a%2==1) {
			System.out.println("홀수년 입니다.");
		}
		
		else {
			System.out.println("짝수년 입니다.");
		}

	}

}
