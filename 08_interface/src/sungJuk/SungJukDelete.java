package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {
	
	@Override
	public void execute(ArrayList <SungJukDTO> arrayList) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 이름 입력 : ");
		String name = scan.next();
		
		int i;
		int count=0;
//		for(i=0; i<arrayList.size(); i++) {
//			if(arrayList.get(i).getName().equals(name)) {
//				arrayList.remove(i);
//				count++; //몇건을 지우는지 알 수 있음 
//				}
//		}//for 에러터짐 삭제가 안됨
		
//		for(SungJukDTO sungJUkDTO : arrayList) {
//			if(sungJukDTO.getName().equals(name)) {
//				arrayList.remove(sungJukDTO);
//				count++;
//			}//에러가 터짐
//		}
		
		Iterator<SungJukDTO> it = arrayList.iterator();
		while(it.hasNext()) {
			SungJukDTO sungJukDTO = it.next();
			
			if(sungJukDTO.getName().equals(name)) {
				it.remove(); //위치의 값을 지우는게 아니라 꺼내오는 것을 지우는것 /it.next()가 반환하는 항목을 지운다
				count++;
			}
		}//while문 
		if(count == 0)
			System.out.println("회원의 정보가 없습니다.");
		else {
			System.out.println(count + "건을 삭제하였습니다");
		}
		
	}

}




/*
6. SungJukDelete.java
- 이름을 입력하여 없는 이름이면 "회원의 정보가 없습니다" 출력하시오
-똑같은 이름이 있으면 모두 삭제한다.


삭제할 이름 입력 : 천사  
회원의 정보가 없습니다

또는 
삭제하였습니다.
*/


