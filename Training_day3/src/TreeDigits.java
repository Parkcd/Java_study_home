import java.util.Scanner;
public class TreeDigits {

	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		
		
		int x;
		
		do {
		  System.out.println("정수를 입력하세요");
		   x = b.nextInt();
		   
		} while(x<100 || x>999);
		
		
		System.out.println("입력한 값은" + x + "입니다.");
		

	}

}
