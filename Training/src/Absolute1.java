import java.util.Scanner;
public class Absolute1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int b = a.nextInt();
		
		
		if(b>=0) {
			System.out.println("절대값은" + b + "입니다.");
		}
		else {
            System.out.println("절대값은" + -b + "입니다.");
		}

	}

}
