package constructor;

import java.util.Scanner;

public class MemberService {
	Scanner scan = new Scanner(System.in);// 스캐너 전역 다 쓸 수 있음
	 MemberDTO[] ar = new MemberDTO[5]; //객체 배열 
	
	
	public MemberService() {
		System.out.println("기본 생성자");
		}

	
	public void menu(){
	int num;

	
	while(true) { 
		  System.out.println();	  
		  System.out.println("**************");
		  System.out.println("     1. 가입 ");
		  System.out.println("     2. 출력 ");
		  System.out.println("     3. 수정 ");
		  System.out.println("     4. 탈퇴 ");
		  System.out.println("     5. 끝내기 ");
		  System.out.println("**************");
		  System.out.println(" 번호 입력  : ");
		  num = scan.nextInt();
		  
		  System.out.println();
		  if (num == 5) break; //while을 벗어남 
		  if (num == 1) insert();
		  else if(num == 2) list();
		  else if(num == 3) update();
		  else if(num == 4) delete();
		  

		  
	}//while문 걸어주는 이유가 쭉 돌다가 나갈 수 있어야 하니깐 
   }//menu()
	
	public void delete() {
		System.out.println("핸드폰 입력 : ");
		String phone = scan.next();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) {
					ar[i] = null;
					System.out.println("1 row(s) deleted");
					
					break;
				}
		   }
	}//for
		
	if(i == ar.length)System.out.println("찾는 회원이 없습니다");
	
	}


	public void update() {
		System.out.println("핸드폰 입력 : ");
		String phone = scan.next();
		
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) {
					System.out.println(ar[i].getName() + "\t"
									  +ar[i].getAge()+ "\t"
									  +ar[i].getPhone()+ "\t"
									  +ar[i].getAddress());
					System.out.println();
					System.out.print("수정할 이름 입력 :");
					String name = scan.next();
					System.out.print("수정 할 핸드폰 입력 : ");
					phone =scan.next();
					System.out.print("수정할 주소 입력 : ");
					String address = scan.next();
					
					ar[i].setName(name);//0
					ar[i].setName(phone);
					ar[i].setName(address);
					
					System.out.println("1 row(s) updated");
					
					break;
				}
			}
		}//for i 
			
			if(i == ar.length)System.out.println("찾는 회원이 없습니다");
	}
	
	public void list() {
		   for(MemberDTO dto :ar) {
		   if(dto != null) {
	      System.out.println(dto.getName() + "\t"
	    		  			 +dto.getAge() + "\t"
	    		  			 +dto.getPhone() + "\t"
	    		  			 +dto.getAddress());
		   }
	    }
   }//for i 

		
	public void insert() {
		int i;
//		for(i=0; i<ar.length; i++) {
//			if(ar[i] == null) break; 
//			} //for문
//		if (i == ar.length) {
//			System.out.println(ar.length +"명의 정원이 꽉 찼습니다.");
//			return; //함수를 벗어나라 
//		}
				
//		1.데이터 입력 
		System.out.println("이름 입력 :");
		String name = scan.next();
		System.out.println("나이 입력 :");
		int age = scan.nextInt();
		System.out.println("핸드폰 입력 :");
		String phone = scan.next();
		System.out.println("주소 입력 :");
		String address = scan.next();

		
//		2.MemberDTO 생성
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null) {
				ar[i] = new MemberDTO(name, phone, age, address);
				break;//for을 벗어남 
				}//		정원초과 되었을때 현재 값이 null이 아니라 데이터가 다 들어가 있을 떄 
			}
		
		if (i == ar.length) {
			System.out.println(ar.length +"명의 정원이 꽉 찼습니다.");
			return; //함수를 벗어나라 
		}
			System.out.println("1 row created");	
			
	}
}
	

