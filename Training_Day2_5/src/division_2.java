import java.util.Scanner;
public class division_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int a = stdIn.nextInt();
		System.out.println("나눌 숫자를 입력하세요");
		int b = stdIn.nextInt();
		

		
		try {
			double c =(int)a/b;
			
			if(c>0) { 
				System.out.printf("나눈값 : " +c);
			}
		}	
		catch(Exception e){
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		
	
		
		

		
		
		
		


	}

}
