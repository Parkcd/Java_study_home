package d0530;

public class Anoymous {
    
    RemoteControl field = new RemoteControl() { 
        @Override 
        public void turnOn() { 
             System.out.println("TV를 켭니다."); 
        } 
       @Override 
       public void turnOff() { 
            System.out.println("TV를 끕니다."); 
       }
	public void turnOff1() {
		// TODO Auto-generated method stub
		
	} 
 }; 

 void method1(){ 
       RemoteControl localVar = new RemoteControl() { 
              @Override 
              public void turnOn() { 
                   System.out.println("Audio를 켭니다."); 
               } 
              @Override 
              public void turnOff() { 
                   System.out.println("Audio를 끕니다."); 
              } 
      }; 
      // 로컬변수 사용 
     localVar.turnOn(); 
} 

void method2(RemoteControl rc){ 
     rc.turnOn(); 

 }
}