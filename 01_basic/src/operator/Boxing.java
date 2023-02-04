package operator;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double)a / 3; //Casting, 강제형변환 /자동형변환 
		
		String c = "25"; //문자열 25
		
		//int d = (int)c; //에러 뜨는 이유는 (기본형)객체형 이렇게 되므로 안됨
		int d = Integer.parseInt(c);  //똑같은 객체형의 함수를 통해서 바꿀 수 있음
		
		int e = 5;
		
		Integer f = e; //JDK 5.0, AutoBoxing  // (기본형 -> 객체형으로 바꾸는 것)
		//Integer f = new Integer(e); //JDK 5.0이전에 썼음 //deplecate이제 안 쓰겠다는것
		
		Integer g = 5; 
		//int h = g; // JDK 5.0 unautoboxing(객체형 -> 기본형 으로 바꾸는것) 
		int h = g.intValue(); //JDK 5.0 이전

	}

}
