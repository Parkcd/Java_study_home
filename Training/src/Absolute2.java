import java.util.Scanner;
public class Absolute2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int b = a.nextInt();
		int c;
		
		if(b>=0) {
			 c = b;
		}
		else {
             c = -b;   
		}
       System.out.println("절대값은" + c + "입니다.");
	}

}
