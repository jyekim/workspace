package basic;

public class Variable01 {

	public static void main(String[] args) {
	  System.out.println(Integer.MIN_VALUE + ", " + Integer.MAX_VALUE);	
	  System.out.println(Long.MIN_VALUE + ", " + Long.MAX_VALUE);	
	  System.out.println();
	  
	  boolean a;
	  a = 25 > 36;
	  System.out.println("a = " + a);
	  
	  char b; 
	  b = 'A';  //65, 0100 0001 
	  System.out.println("b = " + b);
	  
	  char c; 
	  c = 65;
	  System.out.println("c = " + c); //캐럭터로 잡아서 A로 나옴
	  
	  byte d=0;  // 1byte, 8bit, -128 ~ +127
	  //d = 128; - error 
	  System.out.println("d = " + d);   //기본초기값을 주면 error가 사라짐
	  
	  int e;
	  e = 65;  //0100 0001
	  System.out.println("e = " + e);
	  
	  int f;
	  f = 'A'; 
	  System.out.println("f = " + f); // int로 잡아서 65로 나옴 
	  
	  long g;
	  g = 25L; //25L은 long형 상수(데이터)라고 합다
	  
	  float h;
	  //h = 43.8; //43.8은 double형 상수라서 float과 맞지 않음 
	  //h =(float)43.8; //강제형변환 하여 에러를 없앨 수 있음
	  h = 43.8F; // 43.8F 플롯형 상수라는 걸 뜻함
	}

}
