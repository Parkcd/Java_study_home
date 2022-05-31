package NewCar;

public class CarTester2 {

	public static void main(String[] args) {
		class ExCar extends Car_1 {
			@Override public void putSpec() {
				super.putSpec();
				System.out.printf("총 주행 거리:%.2fkm\n", getTotalMileage());
			}
		}

	}

}
