import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("수를 하나 입력하세요");
		int retry = 1;
		
		do {
			int a = c.nextInt();
			if(a>0) {
				System.out.println("이 값은 양수 입니다.");
			}
			else if(a<0) {
				System.out.println("이 값은 음수 입니다.");
			}
			else {
				System.out.println("이 값은 0 입니다.");
			}
				System.out.println("다시한번? 1:Yes , 0:No");
				retry = c.nextInt();
			} while (retry ==1);

	}

}
