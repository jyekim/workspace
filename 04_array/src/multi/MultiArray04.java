package multi;

public class MultiArray04 {

	public static void main(String[] args) {
		int[][] ar = new int[3][];  //가변길이 그때그때마다 달라질 수 있다는 것 
		ar[0] = new int[2];
		ar[1] = new int[3];
		ar[2] = new int[4];
		
		ar[0][0] = 10;
		ar[0][1] = 20;
		ar[1][0] = 30;
		ar[1][1] = 40;
		ar[1][2] = 50;
		ar[2][0] = 60;
		ar[2][1] = 70;
		ar[2][2] = 80;
		ar[2][3] = 90;
		
		System.out.println("배열명 ar = " + ar); //배열명 주소 = [[I@74a10858
		for(int i=0; i<ar.length; i++) {
			
			System.out.println("행 ar[" + i + "]=" + ar[i]);  //각 행단위의 주소//  결과 ar[0]=[I@23fe1d71 
			for(int j=0; j<ar[i].length; j++) { //각각의 주소의 값을 가지고 있기에 ar[i].length
				System.out.println("ar[" + i +"][" + j + "] =" + ar[i][j]);
			}
			System.out.println();
		}
	}

}
