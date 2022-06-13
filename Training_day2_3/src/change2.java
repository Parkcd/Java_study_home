import java.util.ArrayList;
import java.util.Scanner;
public class change2 {
			
		  static final int JINSUNUM = 16;
	
		  public static void main(String[] args) {
			  
			  
			  
			  int num =18;
			  int cnt =0;
			  int[] bin = new int[15];
			  
			  while(num >=1) {
				  
				  bin[cnt] = num % JINSUNUM;
				  cnt++;
				  num= num / JINSUNUM;
			  }
			  
			  for(int i=cnt-1 ; i>=0; i--) {
				  System.out.print(bin[i]);
			  }
			  
		  }
}