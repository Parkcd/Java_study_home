import java.util.Scanner;
public class Doublefor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		for(int i=0;i<=9;i++) {
			System.out.println();
			for(int j=0;j<=i;j++) {
				System.out.print("i=" + i + j);
				
			}
		}

	}

}
