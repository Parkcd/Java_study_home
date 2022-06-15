
public class ArrayTwoInit {

	public static void main(String[] args) {
		System.out.println("//2차원 배열 방법");
		int a[][] = {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
		println(a);
		
		System.out.println("copy 1");
		int b[][] = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			System.arraycopy(a[i],0,b[i],0,b[i].length);
		}
		a[0][0]=-5;
		println(b);
		
		System.out.println("copy 2");
		int c[][] = new int[a.length][a[0].length];
		System.arraycopy(a,0,c,0,c.length);
		a[0][0] =-4;
		println(c);
		
		System.out.println("copy 3");
		int d[][]=new int[a.length][c[0].length];
		d=c;
		c[0][0]=-400;
		println(d);

	}
	
	public static void println(int [][]p) {
		for(int i=0; i<p.length;i++) {
			for(int j=0;j<p[i].length;j++) {
				System.out.print("["+p[i][j]+"]");
			}
			System.out.println();
		}
	}

}
