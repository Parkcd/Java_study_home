import java.util.Random;
import java.util.Scanner;
public class DayCAI1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		
		
		String Englishday[] = {"monday" , "tuesday" , "wednesday" , "thursday"
				               , "friday" , "saturday" , "sunday"};
		String Koreanday[] = {"월" , "화" , "수" , "목" , "금" , "토" , "일"};
		
		System.out.println("요일을 소문자로 입력하세요");
		
		int retry;  // 다시 한번
		int last = -1; // 이전요일
		
		do {
			int day;  // 표시할 요일 : 0~6의 난수
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last = day;
			
			while(true) {
				System.out.print(Koreanday[day] + "요일:");
				String s = stdIn.next();
				
				if(s.equals(Englishday[day])) break;  // 정답
				System.out.println("틀렸습니다");
			}
			System.out.print("정답입니다. 다시 한번? 1...Yes/0...No:");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
			
		}

}
