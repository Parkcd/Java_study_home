/** import java.util.Scanner;
public class Max2A {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.println("실수를 입력하세요");
		
		double a = c.nextDouble();
		double b = c.nextDouble();
		
		if(a>b) {
			System.out.println(a + "가 더 큽니다");
		}
		else {
			System.out.println(b + "가 더 큽니다");
		}
		
		
		
	}

} **/



import java.util.Scanner;
public class Max2A {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		
		System.out.println("실수를 입력하세요");
		
		double a = c.nextDouble();
		double b = c.nextDouble();
		double max;
		
		if(a>b) {
			max = a;
		}
		else {
			max = b;
		}
		
		System.out.println("큰값은" + max + "입니다");
		
	}

}