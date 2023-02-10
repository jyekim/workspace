package multi;

public class MultiArray02 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10]; //한행당 방 10개 총 100개의 데이터
		int num =0; 
		
		// 입력 데이터를 넣는것?
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				num++;
//				ar[i][j] =num;
//			}//for j
//		}//for i
//		
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				num++;
//				ar[j][i] =num;
//			}//for j
//		}//for i
		
//		ar[][]=1;      ar[][]=11;
//		ar[][]=2;      ar[][]=12;
//		ar[][]=3;      ar[][]=13;
//		ar[][]=4;      ar[][]=14;

//		
		for(int i=ar.length-1; i>=0; i--) {
			for(int j=ar[i].length-1; j>=0; j--) {
				num++;
				ar[i][j] =num;
			}//for j
		}//for i
		
//		ar[9][9]=1;      ar[8][9]=11;
//		ar[9][8]=2;      ar[][]=12;
//		ar[9][7]=3;      ar[][]=13;
//		ar[][]=4;      ar[][]=14;

		
		
		// 출력 
		for(int i=0; i<ar.length; i++) {   
			for(int j=0; j<ar[i].length; j++) { 
				System.out.print(String.format("%4d", ar[i][j]));
			}//for j 
			System.out.println();
			}//for i 
		

	}

}
