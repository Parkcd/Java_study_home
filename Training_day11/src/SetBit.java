import java.util.Scanner;
// 이프로그램은 기억할점은 비트연산자 부호가 나오면 십진수를 이진수로 바꿔서 계산하라는 소리임

public class SetBit {
	//---int형 비트 구성 ---//
	static void printBits(int x) {
		int n=0;
		for (int i =31 ; i>=0 ; i--)
			System.out.print(((x >>> i & 1) ==1) ?'1':'0'); // (x >>> i & 1) &는 i를 2진수로 계산해서 풀어라
			n +=1;
	}
	
	//--- x의 pos 위치에 있는 비트를 1로 변경한 값을 반환 ---//
	static int set(int x , int pos) { 
		return x | (1 << pos);    // | 의 역할은 삽입
	}
	
	//--- x의 pos 위치에 있는 비트를 0으로 변경한 값을 반환 ---//
	static int reset(int x , int pos) {
		return x & ~(1 << pos);    // &의 역할은 삭제
	}
	
	//--- x의 pos 위치에 있는 비트를 반전시킨 값을 반환 ---//
		static int inverse(int x , int pos) {
			return x ^ (1 << pos);  // ^의 역할은 반전 
		}
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수x의 pos번째 비트를 변경합니다.");
		System.out.print("x:"); int x = stdIn.nextInt();
		System.out.print("pos:"); int pos = stdIn.nextInt();
		
		System.out.print("x                ="); printBits(x); //printBits 는 사용자 정의함수
		System.out.print("\nset(x,pos)       ="); printBits(set(x, pos));
		System.out.print("\nrset(x, pos)     ="); printBits(reset(x , pos));
		System.out.print("\ninverse(x , pos) ="); printBits(inverse(x, pos));
		System.out.println();
		
	}

}
