package Car_1;

class Car {
	private String name;
	private String number;
	private int height;
	private int width;
	private int length;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double sfc;
	
	//생성자
	
	Car(String name , String number , int height , int width , 
			    int length , double tankage , double fuel ,
			    double sfc) {
		this.name = name; this.number = number; this.height=height; 
		this.width = width; this.length = length; this.x = x;
		this.y = y; this.tankage = tankage;
		//남은 연료의 최대값은 탱크 용량과 동일
		this.fuel = (fuel <= tankage) ? fuel : tankage;
		this.sfc=sfc; x = y = 0.0;
	}
	
	double getX() { return x;}  // 현재 위치의 X좌표 불러오기
	double getY() { return y;}  // 현재 위치의 Y좌표 불러오기
	double getFuel() { return fuel;}  // 남은 연료 불러오기
	
	//---사양 표시 ---//
	void putSpec() {
		System.out.println("이름:" + name);
		System.out.println("번호:" + number);
		System.out.println("전폭:" + width + "mm");
		System.out.println("전고:" + height + "mm");
		System.out.println("전장:" + length + "mm");
		System.out.println("탱크:" + tankage + "리터");
		System.out.println("연비:" + sfc + "km/리터");
	}
	//--- X 방향으로 dx , Y방향으로 dy 이동 ---//
	boolean move(double dx , double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy); // 이동 거리
		double f = dist / sfc;
		
		if(f>fuel)
			return false;
		else {
			fuel -= f;
			x += dx;
			y += dy;
			return true;
		}
	}

	//--- df 리터 급유 ---//
	void refuel(double df) {
		if (df > 0) {
			fuel += df;
			if (fuel > tankage)
				fuel = tankage;
			
		}
	}
	
}
