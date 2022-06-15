
public class ArrayInit {

	public static void main(String[] args) {
		int a[] = {2,5,3,9,8};
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		int b[]=a;
		a[4]=55;
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		int c[] = new int[5];
		System.arraycopy(b, 1, c, 1, b.length);
		b[4]=100;
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i] + "\t");
		}
		


	}

}
