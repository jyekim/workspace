package operator;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //키보드로부터 입력받는 Scanner클래스를 생성
		System.out.print("정수를 입력하시오 : ");
		int num = scan.nextInt();
		
		String result =  num%2==0 ? "짝수" : "홀수";
		                //2의 배수인지 물어본 것, 2로 나누면 나머지가 0입니까?
		String result2 = num%2== 0 && num%3 == 0 ?"공배수이다" : "공배수 아니다";
	                   // '2와 3의 공배수이다'를 알려면? num이 2로 나누면 나머지 0이고, 3로 나누면 나머지 0 이게 공배수임 
		System.out.println(result);
	    System.out.println(result2);

	}

}
