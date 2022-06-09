import java.util.Scanner;
public class three {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자 1:");
		int a = stdIn.nextInt();
		System.out.println("숫자 2:");
		int b = stdIn.nextInt();
		System.out.println("숫자 3:");
		int c = stdIn.nextInt();
		
		int max = ((a>b ? a:b) > c ? (a>b ? a:b) : c);
		int min = ((a<b ? a:b) < c ? (a<b ? a:b) : c);
		System.out.println("최대값 :" + max);
		System.out.println("최솟값 :" + min);

	}

}
