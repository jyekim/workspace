package operator;

public class Operator03 {

	public static void main(String[] args) {
		int a=5;
		
		a += 2;// a = a + 2; 
		a *= 3;
		a /= 5;
		System.out.println("a =" + a); //4
		
		a++; //선행
		
		System.out.println("a =" + a); //5
		
		int b = a++;//5+1\
		System.out.println("a =" + a + " b = " + b); //a =6 b = 5

		
		int c = ++a * b--; //b--는 후행을 뜻함 
		System.out.println("a =" + a + " b = " + b +"c =" + c); //a =7 b = 4 c =35
		
		System.out.println("a++ =" + a++);  //7
		System.out.println("a = " + a);   //8
		

	}

}
