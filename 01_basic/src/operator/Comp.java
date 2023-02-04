package operator;

public class Comp {

	public static void main(String[] args) {
		//char ch = 'B';  //대문자 A
		char ch = 'B';
		
		System.out.println((int)'a'); // 97
		System.out.println((int)'A'); // 65
		
		System.out.println(ch+32);
		
		int result2 = ch>=97 ? ch-32 : ch+32;
		System.out.println(ch + " -> " + (char)result2);
		
		
//	    char result = (ch>=97 && ch<=122) ? (char)(ch-32) :(char)(ch+32);
//	    System.out.println(ch+"->"+result);
		
	   //int result =ch>='A' && ch<='Z' ? ch+32 : ch-32;
	   //System.out.println(ch + " ->" +(char)result);
	    
	    
	    //ch가 대문자입니까 ? 소문자 변환 : 대문자 변환; 
	    

	}   

}


/*
[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

[실행결과]
B → b         e → E

1. int
2. int -> char
3. 조건식

*/