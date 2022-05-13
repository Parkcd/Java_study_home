import java.util.Scanner;
public class EnumScope {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.println("정수 A:"); 
		int a = c.nextInt();
		System.out.println("정수 B:");
		int b = c.nextInt();
		
		if(a>b) {
			int t =a;
			a=b;
			b=t;
		}
	}

}
