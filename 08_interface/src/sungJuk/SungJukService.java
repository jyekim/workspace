package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;


public class SungJukService {
	private ArrayList<SungJukDTO> arrayList = new ArrayList<SungJukDTO>(); 
	//Array와 달리 추가, 수정, 삭제가 가능하며, add/remove method활용
	//array와 동일하게 주소값 반환
		
	public SungJukService() {}
	
	Scanner scan = new Scanner(System.in);
	SungJuk sungJuk = null;
	int num;
	
	public void menu() {
		while(true) {
			System.out.println();
			System.out.println("*************");
			System.out.println("    1.입력 ");
			System.out.println("    2.출력 ");
			System.out.println("    3.수정 ");
			System.out.println("    4.삭제 ");
			System.out.println("    5.정렬 ");
			System.out.println("    6.끝 ");
			System.out.println("*************");
			System.out.println("번호 입력 : ");
			num = scan.nextInt();
			
			if (num == 6) {
			    ;break;
			}
			
			if (num == 1) {
				sungJuk = new SungJukInsert(); //부모 = 자식 
				//SungJukInsert sungJukInsert = new SungJukInsert();
				//Class Value_name이 다수 생성 문제 - 다형성 활용
				//no==1일때 마다 insert 새로 실행	
			}
			else if(num == 2) {
				sungJuk = new SungJukList(); //	
			}else if(num == 3) {
				sungJuk = new SungJukUpdate();
			}
			else if(num == 4) {
				sungJuk = new SungJukDelete();
			}
			else if(num == 5) {
				sungJuk = new SungJukSort();
			} else {
				System.out.println("1~6번까지만 입력하세요");
				continue;
			}	
			sungJuk.execute(arrayList); //호출 
		}//while 
		
		
	}//menu

}
