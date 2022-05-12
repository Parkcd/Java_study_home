import java.util.Scanner;
public class Modulo3 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int a = c.nextInt();
		
		if(a>0)
		{
			if(a%3==0) {
				System.out.println("이 값은 3으로 나누어집니다.");
			}
			else if(a%3==1){
				System.out.println("이 값을 3으로 나눈 나머지는 1입니다");
			}
			else if(a%3==2){
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다");
			}
		}
		else {
			System.out.println("양수가 아닌 값을 입력했습니다.");
		}
	}

}
