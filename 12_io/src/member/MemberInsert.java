package member;

import java.util.Scanner;
import java.util.List;

public class MemberInsert implements Member {
	MemberService memberService = new MemberService();
	
	@Override
	public void execute(List<MemberDTO> list) {
				System.out.println();
				Scanner scan = new Scanner(System.in);
				
				System.out.println("이름 입력 : ");
				String name = scan.next();
				System.out.println("나이 입력 : ");
				int age = scan.nextInt();
				System.out.println("핸드폰 입력: ");
				String phone = scan.next();
				System.out.println("주소 입력 : ");
				String address = scan.next();
				
				
				//MemberDTO 저장 
				MemberDTO memberDTO = new MemberDTO(name, age, phone, address);
				
				list.add(memberDTO);
				System.out.println("입력 완료");
				
			}
	}

