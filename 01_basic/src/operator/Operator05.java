package operator;

public class Operator05 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);    //결과 a = false
		System.out.println("!a = " + !a);  //현재 조건을 반대로 부정할 때 쓰는거 //결과 !a = true 
		
		String b ="apple"; // literal 생성 
		String c = new String("apple");
		
		String result= b == c ? "같다" : "다르다";  //주소 비교  
		System.out.println("b == c : "+ result);
		System.out.println("b == c : "+ (b != c ? "참" : "거짓")); //부정
		System.out.println();
		
		String result2= b.equals(c) ? "같다" : "다르다";  //문자열 비교
		System.out.println("b.equals(c): " + result);
		System.out.println("!b.equals(c): " + ((!b.equals(c) ? "참" : "거짓")));
		System.out.println();
	}

}
