package array;
import java.util.Scanner;
public class Array04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num; 
		boolean [] ar = new boolean[5]; //초기값 false
	
		
	  while(true) { 
		  System.out.println();
		  System.out.println("주차장 관리 프로그램");		  
		  System.out.println("**************");
		  System.out.println("     1. 입차 ");
		  System.out.println("     2. 출차 ");
		  System.out.println("     3. 리스트 ");
		  System.out.println("     4. 종료 ");
		  System.out.println("**************");
		  System.out.println(" 번호 입력  : ");
		  
		  num = scan.nextInt();
		  
		  if(num == 4) break; 
		  if(num == 1) { 
			System.out.println("위치 입력 : ");
			int position = scan.nextInt();
			
			if(ar[position-1]) //이거 자체가 참이라는 것 왜 -1을 해주냐면 0부터 카운트가 되니깐 사용자 입장에서는 헷갈림 그래서 -1 
			  System.out.println("이미 주차되어 있습니다");
			else {
				ar[position-1] = true; //주차가 되어있지않다면.
				System.out.println(position + "위치에 입차");
			}
		  }else if(num == 2) {
			  System.out.println("위치 입력 : ");
				int position = scan.nextInt();
				
			   if(ar[position-1]) {
				   ar[position-1] = false;
				   System.out.println(position + "위치에 출차");
				   
			   }else {
			  System.out.println(position + "주차되어 있지 않습니다");
		  }}
			else if(num == 3) {
	      for(int i=0; i<ar.length; i++) {
	    	  System.out.println((i+1) + "위치 : " + ar[i]);
	      }
		  }
	  }//while 계속 true반복되는 거임 
	    
	
	

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
