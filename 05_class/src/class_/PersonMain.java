package class_;

class Person{
	private String name; // 필드 , 초기값 이미 부여됨(String name=null, int age=0 
	private int age; 
	//위 데이터에 접근할 수 있는 메소드가 필요하다 
	
	public void setName(String n) {//결과형 메소드명(인수형 인수)함수형 안에 있기에  // 구현 
	   name = n;
	}
	
	public void setAge(int a)  { //구현
		age = a;
	}
	
	public void setData(String n, int a) { //구역 단위라서 이름을 똑같이 써도 됨
		name = n;
		age = a;
	}
	
	public void setData() {}
	
	public String getName(){
		return name; //반환값 
	}
	public int getAge() {
		return age;
	}

}

//-----------------
public class PersonMain {

	public static void main(String[] args) {
		Person a;  //객체 선언 
		a = new Person(); //생성 
		
		System.out.println("객체 a = " + a);
		a.setName("홍길동"); //클래스는 이름으로 찾아감 a의 주소를 따라가는거 // 호출을 해줘야함 //호출한 모든 함수는 반드시 제자리로 돌아옴
		a.setAge(25);// 호출 
		
		System.out.println("이름 = " + a.getName() +"\t나이=" + a.getAge());
		
		Person b = new Person();
		System.out.println("객체 b = " + b);
		b.setName("코난");
		b.setAge(13);
		System.out.println("이름 = " + b.getName() +"\t나이=" + b.getAge());
		
		
		Person c = new Person();
		System.out.println("객체 c = " + c);
		c.setData("둘리", 100);// 호출 //인수가 2개나 됨
		System.out.println("이름 = " + c.getName() + "\t나이=" + c.getAge());
		
		Person d = new Person();
		System.out.println("객체 d = " + d);
		d.setData();// 호출 //인수가 2개나 됨
		System.out.println("이름 = " + d.getName() + "\t나이=" + d.getAge());

	}

}

