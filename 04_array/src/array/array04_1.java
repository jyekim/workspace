package array;
import java.util.Scanner;
public class array04_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num; 
		boolean [] ar = new boolean[5]; //초기값 false
		while(true) {
			System.out.println("주차장 관리 프로그램");
			System.out.println("*************");
			System.out.println("1. 입차 ");
			System.out.println("2. 출차 ");
			System.out.println("3. 리스트 ");
			System.out.println("4. 종료 ");
			System.out.println("************");
			System.out.println(" 번호 입력 : ");
			num = scan.nextInt(); 
		}

	}

}



/*
[문제] 주차관리 프로그램

[실행결과]
주차장 관리 프로그램
**************
   1. 입차
   2. 출차
   3. 리스트
   4. 종료
**************
  메뉴 : 
  
1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false  
*/