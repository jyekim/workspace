package class__;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple";  // 모든 클래스가 new로 생성해야하지만 이거는 literal 생성이 가능함 왜냐? heap영역에 잡히기 때문!
		String b = "apple";
		if(a==b) System.out.println("a와 b의 참조값은 같다");
		else System.out.println("a와 b의 참조값은 다르다");
		if(a.equals(b)) System.out.println("a와 b의 문자열은 같다");
		else System.out.println("a와 b의 문자열은 다르다");
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) System.out.println("c와 d의 참조값은 같다");
		else System.out.println("c와 d의 참조값은 다르다");
		if(c.equals(d)) System.out.println("c와 d의 문자열은 같다");
		else System.out.println("c와 d의 문자열은 다르다");
		System.out.println();
		
		String e = "오늘 날짜는 " + 2023 + 2 + 10;  //결과값 오늘 날짜는 2023210 // 만약 숫자들은 더해주고 싶으면 숫자들 괄호하면됨 (2023 + 2 + 10)
		System.out.println("e + = " + e);
		
		/* 
	    문자열 만들어지면 불변;문자열은 편집이 안된다 -> 메모리에 4번의 생성이 일어난다
	    JVM에 의해서 삭제 시 Garbage Collector로 보낸다
	    
		 */
		
		System.out.println("문자열의 크기 = " + e.length());// 배열
		for(int i=0; i<e.length(); i++) {
			System.out.println(i + ":" + e.charAt(i));
			}//for
		System.out.println("부분 문자열 추출= " + e.substring(7));
		System.out.println("부분 문자열 추출= " + e.substring(7,11)); //7번부터 11번 이전

		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색 =" + e.indexOf("짜"));
		System.out.println("문자열 검색 =" + e.indexOf("날짜"));
		System.out.println("문자열 검색 =" + e.indexOf("개바부")); //-1
		
		System.out.println("문자열 치환 =" + e.replace("날짜", "일자"));
			
		
		}

	}


