package class_;
import java.util.Scanner;
public class Compute002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("횟수 입력 : ");
		int count = scan.nextInt(); // 2번 입력 
		
		Compute[] ar = new Compute[count];// 배열 생성
		
		for(int i=0; i<count; i++) {
			System.out.println("[" + (i+1) + "번째]");
			System.out.println("x입력 : ");
			int x = scan.nextInt();
			System.out.println("y입력 : ");
			int y = sc.nextInt();
			
		}
	}

}
