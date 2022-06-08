import java.util.Scanner;
public class calculation {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("숫자 1 :");
		int x = stdIn.nextInt();
		System.out.println("숫자 2 :");
		int y = stdIn.nextInt();
		
		System.out.println("1.가 2.감 3.승 4.제");
		
		int key = stdIn.nextInt();

		
		switch (key) {
		case 1: 
			System.out.println("가 : 더하기(+) 입니다:" + (x+y)  );
			break;
		
		case 2: 
			System.out.println("감 : 빼기(-) 입니다:" + (x-y));
			break;
			
		case 3:
			System.out.println("승 : 곱하기(*) 입니다:"+ (x*y));
			break;
			
		case 4:
			System.out.println("제 : 나누기(/) 입니다.:" + (x/y));
			break;
			
		default:
			System.out.println("1,2,3,4 중 선택해주세요");
			break;
		}

	}

}
