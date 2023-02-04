package operator;

public class Dice {

	public static void main(String[] args) {
		int dice1;
		int dice2;
		dice1 = (int)(Math.random()*6)+1;
		dice2 = (int)(Math.random()*6)+1;
		
		String result = dice1>dice2 ? "첫번째 승리 " : dice1<dice2 ? "두번째 승리" : "무승부";
		System.out.println("주사위1:" + dice1 + "주사위2:"+ dice2 +"결과:"+ result);
		
		String result2 = dice1>dice2 ? "두번째 승리 " : dice1>dice2 ? "첫번째 승리" : "무승부";
		System.out.println("주사위1:" + dice1 + "주사위2:"+ dice2 +"결과:"+ result2);
		
//			0 <= random < 1
//  		0 <= 6*random <6
//			0 +1 <= 6*random +1 < 7		 		
				
	}

}


// 1. 필요한 수 범위
// 2. int 형변환
//3. 조건식


/*
[문제] 주사위 게임 - 난수
2개의 주사위를 던져서 큰값을 가진 주사위가 승이다.
주사위 값의 합도 출력하시오

[실행결과]
주사위1 : 3   주사위2 : 1
주사위1 승
-----------------------------
주사위1 : 4   주사위2 : 6
주사위2 승
-----------------------------
주사위1 : 3   주사위2 :3
무승부


1,2,3,4,5,6
0<=R<1
0+1<=R+1<6+1

난수
-컴퓨터가 불규칙하게 발생하는 수
-0보다 크거나 같고 1보다는 작다 

x~y 사이의 난수를 만들고 싶으면 
(int)(Math.random() * (y-x+1)+ x) 

ex) 65~90 사이의 난수를 발생하고 싶다
(int)(Math.random() * 26+65)
*/