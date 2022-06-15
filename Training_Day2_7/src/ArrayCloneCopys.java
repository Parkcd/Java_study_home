
public class ArrayCloneCopys {

	public static void main(String[] args) {
		
		int a[] = {8,5,2,4,6,3,7,9};
		for(int i=0;i<a.length;i++) {
			System.out.print("["+ a[i] + "]");
		}
		
		int b[] = new int[8];
		for(int i=0;i<=7;i++) {
			System.arraycopy(a, 0, b, 0, 7);
		} 
		
		
	}

}
