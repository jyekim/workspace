package member;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class MemberService {
	
	public MemberService() {}
	
	public void menu() {//menu()
		List<MemberDTO> list = new ArrayList<MemberDTO>(); //부모가 자식을 참조할 수 있는 값
		//ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>();//1인분의 데이터 기준으로 넣어야하니깐 MemberDTO
		Scanner scan = new Scanner(System.in);
		int num;
		Member member;
		
		while(true) {
			System.out.println();
			System.out.println("*************");
			System.out.println("    1.등록 ");
			System.out.println("    2.출력 ");
			System.out.println("    3.핸드폰 검색 ");
			System.out.println("    4.이름으로 오름차순 ");
			System.out.println("    5.파일저장 ");
			System.out.println("    6.파일읽기 ");
			System.out.println("    7.끝 ");
			System.out.println("*************");
			System.out.println("번호 입력 : ");
			num = scan.nextInt();
			
			if (num == 7) { break; 
			}
			else if ( num == 1) {
				member = new MemberInsert();
			}
			else if ( num == 2) {
				member = new MemberPrint();
			}
			else if ( num == 3) {
				member = new MemberPhoneSearch();
			}
			else if ( num == 4) {
				member = new MemberNameAsc(); 
			}
			else if ( num == 5) {
				member = new MemberfileOutput();
			}
			else if ( num == 6) {
				member = new MemberfileInput();
			}
			else {
				System.out.println("1~7번 까지만 입력하세요");
				continue;
			}
		
			member.execute(list);
			//while
	
			}
				
		
	}
}
