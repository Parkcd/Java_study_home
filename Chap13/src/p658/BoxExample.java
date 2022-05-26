package p658;

import javax.swing.Box;

public class BoxExample {

	public static void main(String[] args) {
		box<String> box1 = new box<>() ;
		box1.set("Hello");
		
		String str = box1.get();
		System.out.println(str);
		
		
		box<Integer> box2 = new box<>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
		

	}

}
