package nested;

public class Outer {
	private String name;
	
	public void output() {
		Inner in = new Inner();
		System.out.println("이름 = " + name + "\t나이 = " + in.age);
		}
	
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "\t나이 = " + this.age); ///name은 상속관계가 아니기때문에 outer꺼라서 
		}
	}
	
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "홍길동"; 
		System.out.println("이름 = " + ou.name);
		System.out.println();
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 25;
		in2.disp();
		
		Outer.Inner in3 = ou.new Inner();
		in3.age = 30;
		in3.disp();
		
		Outer.Inner in4 = new Outer().new Inner(); //static 영역에서는 inner클래스에서 outer꺼 갖다 쓸 수 없음 
		//in4.name ="코난"; error가 뜨는 이유: 
		in4.age = 35;
		in4.disp();
		
		
		
	}

}
