import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int retry;
		
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
				System.out.println("다시한번? 0:Yes , 1:No" + retry);
				retry = c.nextInt();
			} while (retry ==1);

	}

}
