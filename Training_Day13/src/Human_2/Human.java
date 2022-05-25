package Human_2;

public class Human {
	private String name;
	private int height;
	private int weight;
	
	//--- 생성자 ---//
	Human(String n , int h , int w){
		name =n; 
		height = h;
		weight = w;
	}
	String getName() { return name;}  //이름 가져오기
	int getHeight() { return height;} //신장 불러오기
	int getWeight() {return weight;}  //체중 불러오기
	
	void gainWeight(int w) {weight += w;}  // 살이찐다
	void reduceWeight(int w) {weight -= w;} // 살이빠진다
	
}
