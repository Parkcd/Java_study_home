import java.util.ArrayList;
import java.util.Scanner;
public class change {

		  public static void main(String[] args) {
			  
			  int num =13;
			  int cnt =0;
			  int[] bin = new int[15];
			  
			  while(num >=1) {
				  
				  bin[cnt] = num%2;
				  cnt++;
				  num= num/2;
			  }
			  
			  for(int i=cnt-1 ; i>=0; i--) {
				  System.out.print(bin[i]);
			  }
			  
			  
			  
/**		        Scanner sc = new Scanner(System.in);
		        int a;
		        ArrayList<Integer> list = new ArrayList<>();
		        System.out.print("수 입력 : ");
		        a = sc.nextInt();
		        list.add(1);
		        
		        for(int i=0; i<list.size(); i++) {
		        	list.add(a%2);
		        	a=a/2;      	
		        }
		        
		        for (int i=list.size(); i>=0; i--) {
		        	System.out.print(list.get(i));
		        } **/
/**        System.out.print("2진수 :");
		        while(true) {
		           //입력한 값의 나머지를 temp에 넣어 나머지를 구한다.
		           temp=a%2;

		           a=a/2;
		            
		            System.out.print(temp);
		            //몫 i의 값이 0이 될때 까지 반복한다.
		            if(a==0) {
		                break; 
		            } **/
		            
		        
		    }


}
		
	
