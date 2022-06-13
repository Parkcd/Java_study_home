package Allseason;

public class enumExample {

	enum Season {
		Spring , Summer , Fall , Winter
	}
	
	public static void main(String[] args) {
		for (Season type : Season.values()) {
			System.out.println(type);
		}

	}

}
