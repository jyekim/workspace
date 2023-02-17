package sungJuk;

import java.util.*;
import java.util.Scanner;

public class SungJukInsert implements SungJuk {
	
	Scanner scan = new Scanner(System.in);
	SungJukService sungJukService = new SungJukService();
	
	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		// execute의 parameter로 SungJukDTO에서 받은 arrayList로 활용 
		// interface 구현을 동일하게 하기 위해서 SungJuk interface 찾아가서 수정 
		
		System.out.println("번호 입력 : ");
		int no = scan.nextInt();
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.println("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.println("수학 입력 : ");
		int math = scan.nextInt();
		
		//SungJukDTO에 저장 
		SungJukDTO sungJukDTO = new SungJukDTO(no, name, kor, eng, math);
		sungJukDTO.calc();// total avg 계산
		//출력은 SungJukList에서 
		arrayList.add(sungJukDTO);
		
		System.out.println("입력하였습니다");
		
		
	}

}
