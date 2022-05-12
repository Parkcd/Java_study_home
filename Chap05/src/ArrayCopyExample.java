
public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"Java" , "array" , "copy"};
		String[] newStrArray = new String[5];  // 해당 열부터 뒤에 모두 선택하고 싶으면 shift + end
		
		System.arraycopy( oldStrArray , 0 , newStrArray , 0 , oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}

	}

}
