import java.util.Scanner;
public class change {

	
		  public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int i, temp;
		        System.out.print("수 입력 : ");
		        i = sc.nextInt();
		        System.out.print("2진수 :");
		        while(true) {
		           //입력한 값의 나머지를 temp에 넣어 나머지를 구한다.
		           temp=i%2;
		           //입력한 값의 몫을 i에 넣어준다.
		           i=i/2;
		            
		            System.out.print(temp);
		            //몫 i의 값이 0이 될때 까지 반복한다.
		            if(i==0) {
		                break;
		            }
		            
		        }
		    }
		}
	
