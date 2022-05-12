
public class CheckOverflowExample {
	public static void main(String[] args) {
		try { 
			int result = safeAdd(2000000000 , 2000000000); //safeAdd -> 사용자 정의 함수 safeAdd 위에 마우스 올리면 물어봄 import 할건지 밑에 함수 만들건지
			System.out.println(result);
		}   catch(ArithmeticException e) {     // catch는 문제가 발생 시 안에있는 코드를 실행함.
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없습니다.");
		}

	}



      public static int safeAdd(int left, int right) { //여기서 int 지우고 void 쓴뒤에 밑에 return 값 없애면 무형식
    	  if((right>0)) { 
    		  if(left>(Integer.MAX_VALUE - right)) {
    			  throw new ArithmeticException("오버플로우 발생"); //Exception은 예외상황 발생
    	  }
      } else {
    	  if(left<(Integer.MIN_VALUE - right)){
    		  throw new ArithmeticException("오버플로우 발생");
    	  }
      }
       return left + right;
       }
      
       }
       


