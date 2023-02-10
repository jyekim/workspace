package array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {32, 40, 25, 78, 56};
		
		
		 for(int i=0; i<ar.length; i++) {
			 System.out.print(String.format("%4d", ar[i]));
			 //System.out.println(ar[i]); 
		 }
		 System.out.println();
		 
		 //정렬
//		 //오름차순(ascending) 
//		 //내림차순(descending)
		 int temp;
		 for(int i=0; i<ar.length-1; i++ ) {
			 for(int j=i+1; j<ar.length; j++) {
				 if(ar[j] > ar[j]) { // > 오름차순, <내림차순 
					temp = ar[j]; //컵으로 비유 우유가 빈컵으로
					ar[j] = ar[j];
					ar[j] = temp;
				 }
			 }// for  j
		 }// for i 
		 System.out.println();

		 // 소트 후 
		 for(int i=0; i<ar.length; i++) {
			 System.out.println(String.format("%4d", ar[i]));
		 }
		 System.out.println();
	}

}
