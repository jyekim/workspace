package array;
import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Scanner scan = new Scanner(System.in);
		System.out.println("현금 입력 : ");
		int money = scan.nextInt();
		
		for(int k=1; k<=money/1000; k++) {
			
	    // 난수 발생 , 중복 x
		for(int i=0; i<6; i++) { //6보다는 lotto.length
			lotto[i] =(int)(Math.random()*45)+1; 
			// 1~45사이의 난수 
	
		for(int j=0; j<i; j++) {
			if(lotto[j] == lotto[i]) {i--; break;
		}
		//난수 발생, 중복 안됨
		//오름차순
		//출력 
		}// for j
		}// for i 
		
		//오름차순 
		int temp; 
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					temp =lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}//for j
		}//for i
		
		
 
		
		
	 for (int data :lotto) {
		 System.out.print(String.format("%5d", data));
		 
	 }
	 System.out.println();
	 if(k%5 == 0) System.out.println();
	  }

}}

	

/*
[문제] 로또 자동완성
-크기가 6개인 배열 생성 
-난수는 1~45 사이의 발생 
-숫자는 오름차순하여 출력해야함(Selection Sort)
-출력시 자리수는 5자리
-중복된 수가 나오면 안됨 
-천원당 1줄 
-5줄 나옴

[실행결과]
2 4 19 39 43 44
*/