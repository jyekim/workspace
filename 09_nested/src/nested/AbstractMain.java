package nested;

public class AbstractMain {
	
	public static void main(String[] args) { //메소드의 구현부를 가질 수 있는 건 class 
		AbstractTest at = new AbstractTest() { //익명 inner 클래스
			public void setName(String name) { //메소드의 구현
				this.name = name;
			}
		};
		
		InterA in = new InterA() {// interA를 new한게 아니라 도와주는 
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {
			//추상메소드가 없기 때문에 원하는 메소드만 Override한다 	
		};
	}
}
