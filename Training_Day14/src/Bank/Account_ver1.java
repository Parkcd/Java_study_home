package Bank;

public class Account_ver1 {
	private String name;  // 계좌 명의
	private String no;  // 계좌 명의
	private long balance;  // 계좌 명의
	
	//--- 생성자 ---//
	Account_ver1(String n , String num , long z){
		name = n;
		no = num;
		balance = z;
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
	
	//--- k원 입금 ---//
	void deposit(long k) {
		balance += k;
	}
	
	//--- k원 출금 ---//
	void withdraw(long k) {
		balance -= k;
	}
	
	
}
