
public class PerpectionNumber {

	public static void main(String[] args) {
		
		int sum;
		
		for(int i=2;i<500;i++) {
			sum =0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum += j;
				} 
			}
			if(sum == i) {
				System.out.println(i + "는 완전수 입니다.");
				System.out.print("[");
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						System.out.print(j);
						if(i!=j) {
							System.out.print(",");
						}
					}
				}
				System.out.println("[");
			}
		}

			

		}
	}

