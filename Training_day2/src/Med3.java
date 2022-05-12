import java.util.Scanner;
public class Med3 {

	public static void main(String[] args) {
		
		Scanner d = new Scanner(System.in);
		
		System.out.println("정수 3가지를 입력하세요");
		
		int a = d.nextInt();
		int b = d.nextInt();
		int c = d.nextInt();

		int med;
		
		if(a>=b) {
			if(a>=c) 
				med = b;
				
			else if(a<=c) 
				med = a;
			else
				med = c;			
		}
		else if(a>c) {
			med = a;
		}
		else if(b>c) {
			med = c;
		}
		else
			med = b;
		
		System.out.println("중앙값은" + med + "입니다.");
		
	}

}
