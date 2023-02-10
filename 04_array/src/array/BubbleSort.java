package array;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = {32, 40, 25, 78, 56};
		
		 for(int i=0; i<ar.length; i++) {
				System.out.print(String.format("%4d", ar[i]));
		 }
		 System.out.println();
		 
		 //정렬
		 //오름차순(ascending) 
		 //내림차순(descending)
		 int temp;
		 for(int i=0; i<ar.length-1; i++ ) {
			 for(int j=0; j<ar.length-1-i; j++  ) {
				 if(ar[j] < ar[j+1]) { // > 오름차순, <내림차순 
					temp = ar[j]; //컵으로 비유 우유가 빈컵으로
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				 }
			 }// for  j
		 }// for i 

		 // 소트 후 
		 for(int i=0; i<ar.length; i++) {
			 System.out.println(String.format("%4d", ar[i]));
		 }
		 System.out.println();
	}


	}


