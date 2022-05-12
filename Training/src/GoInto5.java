import java.util.Scanner;
public class GoInto5 {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int a = c.nextInt();
		
		if(a>0) {
			if(a%5==0) {
				System.out.println("이 값은 5로 나누어 집니다");
			}
			else {
				System.out.println("이 값은 5로 나누어지지 않습니다.");
			}
		
		}
		else {
			System.out.println("음의 정수값을 입력했습니다.");
		}
	}

}
