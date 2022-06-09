import java.util.Scanner;
public class shift {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			
				
			System.out.println("숫자를 입력하세요");
			int a = stdIn.nextInt();
				
			System.out.println("시프트 방향을 고르세요 1.왼쪽 2. 오른쪽");
			int b = stdIn.nextInt();
			
			int c = 2;
				
			
				
			 while(c != 1) {
				
				if(b==1) {
				
					System.out.println("왼쪽으로 이동:" + a*2);
				}
				
				else if(b==2) {
					System.out.println("오른쪽으로 이동:" + a/2);
				
				}
				
				System.out.println("그만할까요? 1..No 2..Yes");
				 c = stdIn.nextInt();
		
			 	}

	}
}
				

			
			


	
				
		
		

