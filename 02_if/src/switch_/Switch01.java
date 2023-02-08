package switch_;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int days=0;     //초기값을 줘야 함 
		
		 System.out.print("월 입력 : ");
		 int month = scan.nextInt();
		 
		 switch(month) {
		 case 1: 
		 case 3: 
		 case 5: 
		 case 7: 
		 case 8: 
		 case 10: 
		 //default : days=0;   위에 초기값을 따로 주지 않을 때 이거 추가해야함
		 case 12: days=31; break;// switch를 벗어나라
		 case 2: days=28; break;
		 case 4: 
		 case 9: 
		 case 11: days=30; break;
		 }
		 System.out.println(month + "월은" + days + "일 입니다");
	}

}
