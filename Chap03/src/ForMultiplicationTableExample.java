
public class ForMultiplicationTableExample {

	public static void main(String[] args) {

		for(int k=0;k<2;k++) {
			for(int j=1; j<=9 ; j++) {
				for(int i=2+(k*4); i<=5+(k*4); i++) {
					System.out.print(i+" x "+j+" = "+ String.format("%2d", i*j) + "   ");
				    //System.out.printf("%d x %d = %2d  ",i,j,i*j); // %2d 하면은 1자리숫자던 2자리숫자던 2칸으로 출력해라.
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}