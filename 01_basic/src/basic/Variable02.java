package basic;

class Test {
	int a = 10; 
	static int b = 20;
	static String str;


}
//--------------------
public class Variable02 {
	int a;        //필드(전역변수?), 초기화 끝남 
	double b; //필드
	static int c;  // 실행하자마자 바로 잡히는 것 

	public static void main(String[] args) {
		int a = 5; //지역변수(local variable), garbage값,그래서 반드시 초기화 필요
		System.out.println("지역변수 a = " + a);
		
		 Variable02 v = new Variable02(); //메모리 생성/new가 진짜 생성되는 것
		 
		System.out.println("객체 = " + v);  //이 변수에 a라는 이름으로 걸려있는 것 //객체 = basic.Variable02@515f550a
		System.out.println("필드 a =" + v.a);  // 필드 a =0 (정수형)
		System.out.println("필드 b =" + v.b);   // 필드 b =0.0 (실수형)
		System.out.println("필드 b =" + c);
		System.out.println("필드 b =" + Variable02.c);
		System.out.println();
		
		//Test클래스의 a값을 출력하시오 
		Test t = new Test();  //메모리 생성 해야함 
		System.out.println("필드 a =" + t.a);
		System.out.println("필드 b =" + Test.b);
		System.out.println("필드 str =" + Test.str); //자바는 null값을 쥐고 있음 

	}

}
