package class__;

import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String original = scan.next();
		
		System.out.println("현재 문자열 입력 : "); //여기서 tolowerclass를 넣어서바꾸면 찍을 때 대소문자가 섞여들어오기 때문에 그냥 원본 그대로 하는게 좋다
		String current = scan.next();

		
		System.out.println("바꿀 문자열 입력 : ");
		String after = scan.next(); 
		
		if(original.length() < current.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다");
			System.out.println("치환할 수 없습니다");
			//return;  //이 함수를 끝내는것 두가지  //1번 return; main을 벗어나면 끝나는것 
			System.exit(0);                  //2번 exit 프로그램을 강제 종료
		}
		
		original = original.toLowerCase();
		current = current.toLowerCase();
		
		int index = 0;
		int count = 0;
		
	
	
		while((index = original.indexOf(current, index)) != -1) { //현재 이 값이 -1이 아닐때까지 돌아가는 것 
			count++;
			index = index + current.length();
		}//while			
		System.out.println(original.replace(current, after));
		System.out.println(count + "번 치환");
		
		
//		index = original.indexOf("aa", 0);
//		2
//		index = original.indexOf("aa", index + "aa".length());
//		4
//		index = original.indexOf("aa", index + "aa".length());
//		9
//		index = original.indexOf("aa", index + "aa".length());
//		-1
		

	}

}


/*
치환하는 프로그램을 작성하시오 - 왜 매개변수가 2개가 들어가는지 indexOf(?, ?), replace()
while 문 if문 들어감
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다
*/