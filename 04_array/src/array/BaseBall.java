package array;
import java.util.Scanner;
public class BaseBall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		String yn;
	    int strike = 0; 
	    int ball = 0; 
	    
	    do {
	    	System.out.println("게임을 실행하시겠습니다(Y/N) : ");
	    	yn = sc.next();
	    	
	    }while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n")); //여기를 빠져나갈려면 y나 n이 들어와야함!
	     
	    if(yn.equals("Y") || yn.equals("y")) {
	    	System.out.println("게임을 시작합니다.");
	    	
	    	//컴퓨터가 난수를 발생해줘야함 
	    	for(int i=0; i<com.length; i++) {
	    		com[i] = (int)(Math.random()*9+1);
	    		
	    		//중복 제거 
	    		for(int j=0; j<i; j++) {
	    			if(com[i] == com[j]) {
	    				i--;    //예를 들어 i--를 하지 않고 1번방에 들어갔는데 위로 올라가면 바로 2로 되기 때문에  
	    				break; //for j를 벗어나라 
	    			}
	    		}//for j 
	    	}//for i 
	    	System.out.println(com[0] + "," + com[1]+ "," +com[2]);
	    	
	    	// 사용자가 숫자를 입력합니다 
	    	while(true) {
	    		System.out.println();
	    		System.out.println("숫자 입력 : ");
	    		int num = sc.nextInt();
	    		
	    	
	    		user[0] = num/100; // num.charAt(0)-48;으로 대체 가능 문자로 받아서 문자'0'== 48 
	    		user[1] = (num%100)/10;//num.charAt(1)-48;
	    		user[2] = (num%100)%10;  //num.charAt(2)-48; 각 백의 자리수, 십의 자리수, 일의 자리수 
	    		System.out.println(user[0] + "," + user[1] + "," + user[2]);
	    		
	    		
	    		//비교 (맞았는지 틀렸는지 확인) 
	    		strike = ball = 0; //초기화 시켜줘야 사용자가 숫자를 입력했을때 누적되지 않고 할 수 있음 
	    		for(int i=0; i<com.length; i++) {
	    			for(int j=0; j<user.length; j++) { 
	    				
	    				if(com[i] == user[j]) {
	    					if(i == j) strike++;
	    					else ball++;
	    			}
	    		}//for j
	    		}//for i
	    		System.out.println(strike + "스트라이크\t" + ball + "볼");
	    		
	    		if(strike == 3) {
	    			System.out.println("정답!");
	    			break; //if랑 상관없이 while을 벗어난다 while을 나가면 프로그램이 끝남  
	    		}	
	    	}//while
	    }else
	    	System.out.println("프로그램을 종료합니다.");
	    
	         }
	   }




	


/* 숙제 
[문제] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼

프로그램을 종료합니다.
*/