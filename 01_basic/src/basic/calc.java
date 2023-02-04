package basic;

public class calc {

	public static void main(String[] args) {
		
		int a = 320;
		int b = 258;
		double div;
		div = (double)a / b;
		
		System.out.println("a+b= "+(a + b));
		System.out.println("a-b= "+(a - b));
		System.out.println("a*b= "+(a * b));
		System.out.println("a/b= "+ String.format("%.2f", div));
		
		
		
	}
	

}
//1줄 주석 
/*
[문제] 320(a), 258(b)을 변수에 저장하여 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오
단, 소수이하 2째자리까지 출력 

[실행결과]
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = xxx
320 / 258 = x.xx
*/