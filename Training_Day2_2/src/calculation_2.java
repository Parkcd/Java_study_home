import java.util.Scanner;

public class calculation_2 {
	public static int add(int x, int y) {
		
		return x+y;
	}
	
	public static int sub(int x , int y) {
		
		return x-y;
	}
	
	public static int mul(int x , int y) {
		
		return x*y;	
	}
	
	public static int div(int x , int y) {
		
		return x/y;
	}

	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("숫자1 :");
		int a = stdIn.nextInt();
		System.out.println("숫자2 :");
		int b = stdIn.nextInt();
		
		System.out.println();
		
		System.out.println("add :" + add(a,b));
		System.out.println("sub :" + sub(a,b));
		System.out.println("mul :" + mul(a,b));
		System.out.println("div :" + div(a,b));

		
		
	}

}
