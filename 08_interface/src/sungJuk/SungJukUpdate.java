package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {
	String name;
	int kor;
	int eng;
	int math;
	

	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("번호 입력 : ");
		int no = scan.nextInt();
		
		
		int sw = 0;
		for(SungJukDTO sungJukDTO : arrayList) {
			if(sungJukDTO.getNo() == no) {
				sw= 1; break;}
				else {
				
				System.out.println(sungJukDTO);
				System.out.println("수정 할 이름 입력 : ");
				String name = scan.next();
				System.out.println("수정 할 국어 입력 : ");
				int kor = scan.nextInt();
				System.out.println("수정 할 영어 입력 : ");
				int eng = scan.nextInt();
				System.out.println("수정 할 수학 입력 : ");
				int math = scan.nextInt();
				
				sungJukDTO.setName(name);
				sungJukDTO.setKor(kor);
				sungJukDTO.setEng(eng);
				sungJukDTO.setMath(math);
				
				sungJukDTO.calc();
				System.out.println("수정하였습니다.");
			}
		}//for
		
		//sw=0인 경우,  !=0인 상태  
		//sw=1인 경우,  ==0인 상태 
		
		if(sw == 0)
			System.out.println("없는 번호 입니다.");
		scan.close();
	}
}
		
//		int i;
//		for(i=0; i<arrayList.size(); i++) {
//			
//			if(arrayList.get(i).getNo() == no) break; //i가 0,1,2
//			
//		}//for
//		
//		if(i == arrayList.size()) 
//			System.out.println("없는 번호 입니다.");
//		else {
//			System.out.println(arrayList.get(i));
//			
//			System.out.println("수정 할 이름 입력 : ");
//			String name = scan.next();
//			System.out.println("수정 할 국어 입력 : ");
//			int kor = scan.nextInt();
//			System.out.println("수정 할 영어 입력 : ");
//			int eng = scan.nextInt();
//			System.out.println("수정 할 수학 입력 : ");
//			int math = scan.nextInt();

//			arrayList.get(i).setName(name_rev);
//			arrayList.get(i).setKor(kor_rev);
//			arrayList.get(i).setEng(eng_rev);
//			arrayList.get(i).setMath(math_rev);	
//			arrayList.get(i).calc();
//			
//			System.out.println("\n수정하였습니다.");
//			}
			
					
			
				
		
		
		
	
	

