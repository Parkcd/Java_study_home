package Animal_2;

  class Cat extends Animal {
	private int age;		//나이
	public Cat(String name , int age) {
		super(name); this.age = age;
	}
	
	public void bark() { System.out.println("냐옹!");} //짖기
	public String toString() {
		return age + "외" + getName();
	}

}


