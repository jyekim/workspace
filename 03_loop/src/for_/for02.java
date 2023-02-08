package for_;
import java.util.Scanner;
public class for02 {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("원하는 단을 입력 : ");
	   int dan = scan.nextInt();
	   
	   for(int i=1; i<=9; i++) {
	   System.out.println(dan + "*" + i + "=" + dan*i);
	   
	    
		

	}

}
}
	
/*
[문제] 구구단
원하는 단을 입력 : 2
2*1=2
*/
