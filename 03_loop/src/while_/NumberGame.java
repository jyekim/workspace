package while_;
import java.util.Scanner;
public class NumberGame {

	public static void main(String[] args) {
		 //while문과 if문 
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		int com, user, count=0;
	        com = (int)(Math.random()*100 + 1);// 1~100 만약 6
	        //System.out.println(com);
			System.out.println("1~100사이의 숫자를 맞추세요");
			System.out.println();
			
			while(true) {
				System.out.println("숫자 입력 : ");
				user = scan.nextInt();
				count++; // count = count + 1 
				if(com == user) break; //정답을 맞출 시 브레이크로 나가고 while문을 나옴
				
				if(com > user) System.out.println(user +"보다 큰 숫자입니다.");
				else if(com < user)System.out.println(user + "보다 작은 숫자입니다.");
			
			}//while 
			System.out.println("\n 딩동댕..."+ count + "번 만에 맞추셨습니다.");
			
			System.out.print("\n 한번 더 ( y/n) : ");
			//int yn = scan.nextInt(); // y or n 
			String yn = scan.next();
			//if(yn =='n'|| yn == 'N') break; // int형일때 
			if(yn.equals("n") || yn.equals("N")) break; // 문자열을 비교할때는 == 등호가 아니라 equals로 해야함 
		}// while로 잡히는 것 
		System.out.println("프로그램을 종료합니다.");
		
			

	}

}



/*숫자맞추기 게임
-컴퓨터가 1~100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임 
-몇 번 만에 맞추었는지 출력 

[실행결과]
1~100사이의 숫자를 맞추세요 (70)

숫자입력 : 50
50보다 큰 숫자입니다.

숫자 입력 : 85
85보다 작은 숫자입니다.

----------
숫자입력 :70
딩동댕 몇번 만에 맞추셨습니다. 

한번 더 ( y/n) : y 
숫자 난수가 발생을 하고 
[실행결과]
1~100사이의 숫자를 맞추세요 (70)

숫자입력 : 50
50보다 큰 숫자입니다.

숫자 입력 : 85
85보다 작은 숫자입니다.
다시 반복 그런데 
한번 더 (y/n) : n이면 
프로그램 종료 

한번 더 (y/n) : 
질문을 했을 때 y가 아닌 다른 알파벳을 넣었을 때 이 질문을 반복하도록
만들어야함 어떻게 하는지? 

*/