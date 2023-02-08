package for_;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		int num = 0; 
		int fac = 1;
		String intermediateresults = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		num = scan.nextInt();
		for(int i= 1; i<=num; i++) {
		fac *= i;    // fac = fac *1 
		intermediateresults += (i == num) ? i : i + "*";
		}
	    System.out.println(num + "! = " + fac +"("+ intermediateresults + ")");
	
		}

	}



// 5 = 5*4*3*2*1
/*
[문제] 팩토리얼 구하기 (for)
입력되는 숫자는 1~10 사이만 입력한다.

[실행결과]
숫자 입력 : 3
3! = 6(1*2*3)
-------------------
숫자 입력 : 5
5! = 120(1*2*3*4*5) 
 */