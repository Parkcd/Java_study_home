import java.util.Random;
import java.util.Scanner;
public class DayCAI2 {

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
			
			int action;
			
			do {
				System.out.print(Koreanday[day] + "요일:");
				String s = stdIn.next();
				
				if(s.equals(Englishday[day])) {  // 정답
				System.out.println("정답입니다");
				break;
			}
			System.out.println("틀렸습니다");
			do {
				System.out.print("어떻게 할까요? 1...재입력/0...정답 보기:");
				action = stdIn.nextInt();
			} while (action !=0 && action !=1);
			if (action==0)
				System.out.println(Koreanday[day] + "요일은\"" + 
			Englishday[day] + "\"입니다.");
			} while (action == 1);
			
			System.out.print("다시 한번? 1...Yes/0...No:");
			retry = stdIn.nextInt();
		} while (retry ==1);

 }
}