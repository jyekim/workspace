package class_;

class This {
	private int b; //필드
	private static int c; //main이라는 함수가 static임. 시음식과도 같은 개념 그래서 이미 생성이 되어 있으니 그대로 가져오면됨//이 안에는 This가 없음
	
	public void setB(int b) {    //구현 , 인수(argument), 매개변수(parameter) 밑에 b의 값을 여기로 던져줘야함 
		System.out.println("this = " + this);
		this.b = b;
	}
	public void setC(int c) {    //구현 , 인수(argument), 매개변수(parameter) 밑에 b의 값을 여기로 던져줘야함 
		this.c = c;
	}
	public int getB() {
		return b; 
	}
	public int getC() {
		return c; 
	}
	
}
//-----------------
public class ThisMain {
	private int a; // 필드 //클래스 따로 안 잡고 시작함 //클래스는 식당 메뉴판과도 같음모든 클래스는 반드시 생성해야한다

	public static void main(String[] args) {
		ThisMain tm = new ThisMain();
		tm.a = 10; //갖고 있는 class ThisMain 이라고 잡고 해서 private이라도 접근 가능함 
		System.out.println("a = " + tm.a);
		
		This t = new This(); //위에 This를 이렇게 b,w로 두개 생성함 
		System.out.println("객체 t = " + t);
		t.setB(20);
		System.out.println("t.b = " + t.getB());
		
		t.setC(30);
		System.out.println("t.c = " + t.getC());
		System.out.println();
		
		This w = new This();
		System.out.println("객체 w = " + w);
		w.setB(40);
		w.setC(50);
		System.out.println("w.b = " + w.getB());
		System.out.println("w.c = " + w.getC());
	
	}

}
