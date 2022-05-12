import java.util.Scanner;
public class Max2B {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		
		System.out.println("실수를 입력하세요");
		
		double a = c.nextDouble();
		double b = c.nextDouble();
		double max = a > b ? a : b ;
		
		System.out.println("더 큰 값은"+ max + "입니다");

		

	}

}
