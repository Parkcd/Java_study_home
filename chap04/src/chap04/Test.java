package chap04;

public class Test {

	public static void main(String[] args) {
		int num = 5;
		
		int sum = ++num + num++; // 같은 줄에 있으면 전위냐 후위냐 나뉘는데 다른칸에 있으면 신경x
		
		System.out.println("num=" + num);
		System.out.println("sum=" + sum);

	}

}
