import java.util.Arrays;
import java.util.Scanner;                                 
public class Ten {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[] = new int[10];
		
		for(int i=0 ; i<=9 ; i++) {
			System.out.println("값 입력");
			int b=stdIn.nextInt();
			a[i]=b;
		}
		
		Arrays.sort(a);
		
		int max = a[9];
		int min = a[0];
		int avg = a[4];
				
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		System.out.println("중간값" + avg);

	}

}
