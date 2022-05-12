package chap04;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1; // +1을 해준이유는 그냥하면 0~5까지의 숫자가 나와서 1~6 으로 나오게끔 바꾼거임
		
		switch(num) {
		   case 1:
			   System.out.println("1번이 나왔습니다.");
		   case 2:
			   System.out.println("2번이 나왔습니다.");
		   case 3:
			   System.out.println("3번이 나왔습니다.");
		   case 4:
			   System.out.println("4번이 나왔습니다.");
		   case 5:
			   System.out.println("5번이 나왔습니다.");
		   default:
			   System.out.println("6번이 나왔습니다.");
			   break; // break는 멈추는거고 continue는 다시 진행시킴
		}

	}

}


