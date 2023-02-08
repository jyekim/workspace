package for_;

public class For01 {

	public static void main(String[] args) {
	   int i;
		for(i=1; i<=10; i++) {
		   
		   System.out.println("Hello Java!! : " + i);
		}//글이 10번 찍혀서 나온다는 뜻  
		   System.out.println("탈출 i = " + i);
		   
		   
		   //10 9 8 7 6 5 4 3 2 1 
	 for(i=10; i>=1; i--) {
		 System.out.println(i+ " "); //println을 지워야 옆으로 나옴  
	 }
	 
	
	 for(i='A'; i<='Z'; i++) {
	 System.out.print((char)i + " ");  //변수형변환

	 }

}
	}	 
