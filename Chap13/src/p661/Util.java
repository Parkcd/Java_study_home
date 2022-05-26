package p661;

import p658.box;

public class Util {
	public static <T> box<T> boxing(T t) {
		box<T> box = new box<T>();
		box.set(t);
		return box;
	}

}
