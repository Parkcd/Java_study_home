
public class StringEqualExample {

	public static void main(String[] args) {
		String strVar1 = "박성호";
		String strVar2 = "박성호";
		
		if(strVar1 == strVar2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		String strVar3 = new String("박성호");
		String strVar4 = new String("박성호");

		if(strVar3 == strVar4) { // 메모리 주소로 비교해서 다름이 뜸
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		if(strVar3.equals(strVar4)) { // 값으로 비교 해서 같음이 뜨는거임
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
	}

}
