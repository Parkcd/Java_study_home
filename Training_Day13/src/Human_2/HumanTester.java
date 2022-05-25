package Human_2;

public class HumanTester {

	public static void main(String[] args) {
		Human gildong = new Human("길동", 170 , 60);
		Human chulsu = new Human("철수", 180 , 75);
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(5);
		
		System.out.println("이름:" + gildong.getName());
		System.out.println("신장:" + gildong.getHeight() + "cm");
		System.out.println("이름:" + gildong.getWeight() + "kg");
		
		System.out.println("이름:" + chulsu.getName());
		System.out.println("신장:" + chulsu.getHeight() + "cm");
		System.out.println("이름:" + chulsu.getWeight() + "kg");

	}

}
