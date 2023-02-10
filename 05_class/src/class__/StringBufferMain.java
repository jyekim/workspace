package class__;

import java.util.Scanner;
public class StringBufferMain {
	private int dan; //이렇게 위에 위치하면 class를 포함한 모든 부분에서 쓸 수 있기에 
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 단을 입력 : ");
	    dan = scan.nextInt();
	  }
	public void output() {
		StringBuffer buffer = new StringBuffer(); //append()는 끝에다 추가하는것 , delete()
		
		for(int i=1; i<=9; i++) {
		//System.out.println(dan + "*" + i + "=" + dan*i);
			
			
			
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer.toString()); //StringBuffer 가 String으로 변환됨 그래서 toString이 쓰임
	        
			buffer.delete(0,1000);//그냥 큰 숫자를 잡아서하면 그 값들의 자리들을 다 지울 수 있음
			buffer.delete(0,buffer.length()); //문자열의 개수가 나오기 때문에 딱떨어져서 나옴
		}//for
}

	public static void main(String[] args) {
		StringBufferMain sbm = new StringBufferMain();
		sbm.input();
		sbm.output();
		
		     
	
		  }
	

	}




/*
[문제]구구단

원하는 단을 입력 : 5   input() 함수로 받고 
-------------------------------------
5*1 = 5           아래는 output() 함수로 출력
5*2 =10 
5*3 =15


5*9=45
*/