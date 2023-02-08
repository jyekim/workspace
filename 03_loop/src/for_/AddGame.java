package for_;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, dab, count=0;
		for(int i=1; i<=5; i++) { 
			a = (int)(Math.random()*(99-10+1)+10); //10~99 사이의 난수이니 시작이 10이여야함 
			b = (int)(Math.random()*(99-10+1)+10);
			
			for(int j=1; j<=2; j++) {
				System.out.println(a +" + " + b + " = ");
				dab = scan.nextInt();
				
				if(dab == a+b) {
					System.out.println("참 잘했어요");
					count++; //count = count + 1
					break;// for j를 벗어나라 
				}
				else 
					if(j == 1) System.out.println("틀렸다"); //틀렸을때는 여기서부터 여기까지
					else if(j == 2) System.out.println("틀렸다 정답은 " + (a+b));
		     }// for문으로 감싸
	    }
		System.out.println();
		System.out.println("당신은 총" + count + "문제를 맞추어서 점수" + count*20 + "점 입니다.");

		}
	}

/*
[문제] 덧셈 문제 -for, if, break 
2자리 숫자 (10 ~99) 만 제공한다
-총 5문제를 제공한다
-1문제당 20점씩 처리한다 
-틀리면 1번 더 기회를 준다.


[실행 결과]
a    b
[1] 87 + 56 = 
틀렸다 
[1] 87 + 56 = 150
틀렸다 정답은 143  추가해서 넣기 


[2] 17 + 64 = 81 
참 잘했어요 

[5] 82 + 45 = 78
틀렸다 

당신은 총 x문제(count)를 맞추어서 점수 xx점(count *20) 입니다. 
*/