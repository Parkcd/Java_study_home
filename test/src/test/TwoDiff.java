package test;

public class TwoDiff {

	public static void main(String[] args) {
		int a=5;
		double b=17;
		
		int k = (int)((a>=b) ? a-b : b-a);
		
		System.out.println("두값의 차이는" + k + "입니다.");

	}

}
