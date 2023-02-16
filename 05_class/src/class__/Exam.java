package class__;

import java.util.Scanner;

public class Exam {
	private String name = null;
	private String dap = null;
	private char[] ox = null;
	private int score = 0;
	private final String JUNG = "11111"; //상수화
	
	public Exam(){
		Scanner scan = new Scanner(System.in);
		System.out.print("이름입력 : ");
		this.name = scan.next();
		System.out.print("답 입력 : ");
		this.dap = scan.next();
		
		ox = new char[5]; //생성 //이걸 필드에 써도 상관없음 중요한건 생성을 해야함 
		
	}
	//dap =12345
	public void compare() {//5개를 가지고 비교를 해야한다 //주말동안 복습할 때 이부분을 못했음
		for(int i =0; i<ox.length; i++) {
		if(dap.charAt(i) == JUNG.charAt(i)) { //for문이 아니라면 5개를 다 if와 else로 번갈아가면서 해야함 
			ox[i] = 'O';
			score += 20; 
		}else
			ox[i] = 'X';
		
		}
	}
	
	public String getName() {
		return name;
	}
	
	public char[] getOx() {
		return ox;
	}
	
	public int getScore() {
		return score;
	}

}
