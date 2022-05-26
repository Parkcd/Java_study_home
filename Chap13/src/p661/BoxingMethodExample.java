package p661;

import p658.box;

public class BoxingMethodExample {

	public static void main(String[] args) {
		box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
