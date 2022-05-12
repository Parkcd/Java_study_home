package chap04;

public class sungjuk {


	public static void main(String[] args) {
		int score = 95;
		int num = score/10;
		
		if(num == 10) {
             num = 9;		
		}
		
		switch(num) {
		   case 9:
			   System.out.println("A학점 입니다.");
			   break;
		   case 8:
			   System.out.println("B학점 입니다.");
			   break;
		   case 7:
			   System.out.println("C학점 입니다.");
			   break;
		   case 6:
			   System.out.println("D학점 입니다.");
			   break;
		   case 5:
			   System.out.println("E학점 입니다.");
			   break;
		   default:
			   System.out.println("F학점 입니다.");
		}

	}

}