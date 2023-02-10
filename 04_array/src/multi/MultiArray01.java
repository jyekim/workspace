package multi;

public class MultiArray01 {

	public static void main(String[] args) {
		int[][] ar = new int[3][2];
		
		ar[0][0]=10;
		ar[0][1]=20;

		ar[1][0]=30;
		ar[1][1]=40;
		
		ar[2][0]=50;
		ar[2][1]=60;
		
		for(int i=0; i<ar.length; i++) {   //3 대신 ar.length로 하면 ar의 데이터를 가져옴
			for(int j=0; j<ar[i].length; j++) { //ar[i].length가 각 행마다 주소를 가지고있음
				System.out.println("ar[" + i +"]["+ j + "] = " + ar[i][j]);
			}//for j 
			System.out.println();
		}//for i 

	}

}
