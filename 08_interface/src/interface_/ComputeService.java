package interface_;

import java.util.Scanner;

public class ComputeService  {

	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		Compute com = null; //inter
	
		
		while(true) {
		
		System.out.println();
		System.out.println("***************");
		System.out.println("        1.합");
		System.out.println("        2.차");
		System.out.println("        3.곱");
		System.out.println("        4.몫");
		System.out.println("        5.끝내기");
		System.out.println("***************");
		System.out.println("  번호 : ");
		
		int num = scan.nextInt();
		
	
		
		if(num == 1) com = new Sum(); //부모 = 자식
		else if(num == 2) com = new Sub();
		else if(num == 3);
		else if(num == 4);
		else if(num ==5) { break;}
		
		
		com.disp();
		
	    }//while
	}//menu()
		

}
