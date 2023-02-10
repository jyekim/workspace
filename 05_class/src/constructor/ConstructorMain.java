package constructor;

public class ConstructorMain {
	private String name;
	private int age; 
	
	public ConstructorMain() { // void를 넣으면 아무것도 호출이 안됨 생성자의 역할을 못함
		System.out.println("default 생성자");
	}
	public ConstructorMain(String name) {
		this();
		System.out.println("name 처리생성자");
		this.name = name;
	}
	public ConstructorMain(int age) {//생성자 3개 만들면 생성자overload
		this("코난");     //overload된 다른 생성자를 호출할 수 있다. 
		System.out.println("age 처리 생성자");
		this.age = age;
		
	}

	public static void main(String[] args) {
	   ConstructorMain aa = new ConstructorMain();
	   System.out.println(aa.name + "\t" + aa.age);
	   System.out.println();
	  
	   ConstructorMain bb = new ConstructorMain("홍길동");
	   System.out.println(bb.name + "\t" + bb.age);
	   System.out.println();
	   
	   ConstructorMain cc = new ConstructorMain("25"); //생성자는 new 할 때 호출됨
	   System.out.println(cc.name + "\t" + cc.age);
	   System.out.println();
	}

}
