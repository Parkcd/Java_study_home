
public class infinity {

	public static void main(String[] args) {
		int a = 0;
		
		while(true) {
			a++;
			
			if(a%2==1) {
				System.out.println("홀수:" + a);
			}
			
			if(a%2==0) {
				System.out.println("짝수:" +a);
			}
			
			if(a==10) {
				break;
			}
		}	
	}

}
