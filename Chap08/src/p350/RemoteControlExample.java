package p350;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;  // 인터페이스 변수 선언
		
		rc = new Television(); 
		rc.turnOn(); //인터페이스의 turnOn() 메소드를 호출 
		rc.turnOff();
		rc.setMute(true);
		
		
		rc = new Audio();
		rc.turnOn(); //인터페이스의 turnOn() 메소드를 호출
		rc.turnOff();
		rc.setMute(true);
		
			
			
		}

		
	}


