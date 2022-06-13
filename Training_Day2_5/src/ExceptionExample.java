import java.util.Scanner;
public class ExceptionExample {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		try {
			System.out.println("숫자를 입력하세요");
			int a = stdIn.nextInt();
			System.out.println("입력한 숫자:" + a);
		}
		
		catch(Exception e) {
			System.out.println("숫자를 입력하지 않았네요");
		}

	}

}
