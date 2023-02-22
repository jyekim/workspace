package exception;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		if(args.length >= 2) {
			System.out.println(args[0]);
			System.out.println(args[1]);

		}
		System.out.println();
		
		try {
		int num1 = Integer.parseInt(args[0]); //숫자형태로 들어와야 parseInt 정수형으로 나옴 
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + "/" + num2 + " = "+ (num1/num2));
	}catch(NumberFormatException e) {
		System.out.println("반드시 숫자 형식으로 입력하세요");
		e.printStackTrace();
		
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다");
			e.printStackTrace();
		
		}finally {
			System.out.println("error가 있건 없건 무조건 실행");// 이문장 자체는 계속실행됨
		}
	

	}
}
