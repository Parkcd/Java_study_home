package Bank;

public class Account {
	private String name;  // 계좌 명의
	private String no;  // 계좌 명의
	private long balance;  // 계좌 명의
	private Day openDay;
	
	//--- 생성자 ---//
	Account(String n , String num , long z , Day d){
		name = n;
		no = num;
		balance = z;
		openDay = new Day(d);
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
	
	//--- 계좌 개설일 확인 ---//
	public Day getOpenDay() {
		return new Day(openDay);
	}
	
	//--- k원 입금 ---//
	void deposit(long k) {
		balance += k;
	}
	
	//--- k원 출금 ---//
	void withdraw(long k) {
		balance -= k;
	}
	
	//--- 문자열 표현에 의한 계좌 기본 정보 반환 ---//
	public String toString() {
		return "{" + name + "," + no + "," + balance +"}";
}

}
