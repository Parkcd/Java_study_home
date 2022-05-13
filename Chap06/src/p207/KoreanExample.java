package p207;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박성호" , "123456-1234567");
		System.out.println("k1.name :" + k1.name);
		System.out.println("k1.ssn :" + k1.ssn);
		
		Korean k2 = new Korean("빡성호" , "654321-7654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}

}
