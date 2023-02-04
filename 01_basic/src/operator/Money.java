package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		int money = 5378;
		
		Scanner scan = new Scanner(System.in); //키보드로부터 입력받는 Scanner클래스를 생성
		System.out.print("돈 입력 : ");
		money = scan.nextInt();
		
		int thousand = money/1000;
		int thousand_mod = money % 1000; //378
		
		int hundred= thousand_mod/ 100; //3
		int hundred_mod = thousand_mod % 100; //78
		
		int ten = hundred_mod / 10; //7
		int one = hundred_mod % 10; //8
		
	    DecimalFormat df = new DecimalFormat();
	    
	    
		System.out.println("현금 : " + df.format(money) + "원" ); //3자리마다, 찍기
		System.out.println("천원 : " + thousand + "장");
		System.out.println("백원 : " + hundred+ "개");
		System.out.println("십원 : " + ten + "개");
		System.out.println("일원 : " + one + "개");
	}

}
/*
[문제] 동전교환기 - 현금 5378원이 있습니다.

[실행결과]
현금 : 5378원 
천원 : 5장
백원 : 3개 
십원 : 7개
일원 : 8개
*/