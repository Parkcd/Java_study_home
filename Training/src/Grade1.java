import java.util.Scanner;
public class Grade1 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		int a = c.nextInt();
		
		if(a>=0 && a<50) {
			System.out.println("가");
		}
		else if(a>=50 && a<=59) {
			System.out.println("양");
		}
		
		else if(a>=60 && a<=69) {
			System.out.println("미");
		}
		
		else if(a>=70 && a<=79) {
			System.out.println("우");
		}
		
		else if(a>=80 && a<=89) {
			System.out.println("우");
		}
		
		else if(a>=90 && a<=100) {
			System.out.println("수");
		}
		
		else {
			System.out.println("잘못된 입력값 입니다.");
		}
	}

}
