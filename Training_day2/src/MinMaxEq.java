import java.util.Scanner;
public class MinMaxEq {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("정수 2가지를 입력하세요");
		
		int a = c.nextInt();
		int b = c.nextInt();

		if(a == b) {
			System.out.println("두 값이 같습니다");
		}
		
		else {
			int max;
			int min;
			if(a>b) {
				max = a;
				min = b;
			}
			else {
				max = b;
				min = a;
			}
			
			System.out.println("작은 값은" + min + "입니다");
			System.out.println("큰 값은" + max + "입니다");
		}
	}

}
