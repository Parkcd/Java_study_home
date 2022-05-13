package p314;

public class kumhoTire extends Tire{
	//필드
	
	//생성자
	public kumhoTire(String location , int maxRotation) {
		super(location , maxRotation);
	}
	
	//메소드
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + " kumhoTire 수명:" + 
		(maxRotation-accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "kumhoTire 펑크 ***");
			return false;
		}
		
	}

}
