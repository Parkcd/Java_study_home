import java.util.Scanner;
public class Message {


		public static void main(String[] args) {
			
			Scanner scanner= new Scanner(System.in);
			System.out.println("알파벳을 입력하세요.");
			String s=scanner.next();
			for (int i = 0; i < s.length(); i++) {
				//문자를 숫자로 바꿔줄때는 (INT)를 붙혀준다
				//charAT 문자열의 접근
				System.out.print(((int)s.charAt(i)));
			}
			scanner.close();
		}
	}
