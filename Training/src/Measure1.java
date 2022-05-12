import java.util.Scanner;
public class Measure1 {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a= d.nextInt();
		int b= d.nextInt();
		
		
		
		if(a%b==0) {
			System.out.println(b+"는"+ a + "의 약수 입니다.");
		}
		
		else {
			System.out.println(b+"는"+ a + "의 약수가 아닙니다.");
		}

	}

}
