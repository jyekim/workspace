package if_;

import java.util.Scanner;

public class If02 {

	
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		System.out.print("a과목점수 : ");
		int a = scan.nextInt();
		System.out.print("b과목점수 : ");
		int b = scan.nextInt();
		System.out.print("c과목점수 : ");
		int c = scan.nextInt();
		
		//평균 구하기 if(평균이 60 이상입니까) 
		//             if(과목별 40 이상입니까)
		int tot = a + b + c;
		double avg = tot/3;
		System.out.println("총점 : "+ tot);
		System.out.println("평균 : "+ avg);
		
		
		if(avg >= 60) 
			if(a>=40 && b>=40 && c>=40)
			System.out.println("합격");
			else System.out.println("과락으로 불합격");
		  else
			System.out.println("불합격");

	}

}

/*
[문제] 
3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다

[실행결과]
a의 값 : 98
b의 값 : 90
c의 값 : 85
합격

a의 값 : 98
b의 값 : 90
c의 값 : 35
과락으로 불합격

a의 값 : 68
b의 값 : 50
c의 값 : 45
불합격
 */