package Bank;

public class Account {
	private static int counter = 0;
	
	private String name;
	private String no;
	private long balance;

	

	//--- 생성자 ---//
	public Account (String n , String num , long z) {
		name = n;
		no = num;
		balance =z;
	}
	
	//--- 계좌 명의 확인 ---//
	public String getName() {
		return name;
	}
	//--- 계좌 번호 확인 ---//
	public String getNo() {
		return no;
	}
	//--- 예금 잔고 확인 ---//
	public long getBalance() {
		return balance;
	}

	//---k원 입금 ---//
	void deposit(long k) {
		balance += k;
	}
	
	//--- k원 출금 ---//
	void withdraw(long k) {
		balance -= k;
	}
	
	//--- 문자열 표현에 의한 계좌 기본 정보 반환---//
	public String toString() {
		return "{" + name + "," + no + "," + balance +"}";
	}
	
	

}
