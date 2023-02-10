package array;

public class array01_1 {

	public static void main(String[] args) {
		int[] ar;
		ar = new int[5]; 
		
		ar[0] = 25;
		ar[1] = 35;
		ar[2] = 55;
		ar[3] = 42;
		ar[4] = 30;
		System.out.println("배열크기 : "+ ar.length);
		
		//for문으로 값 출력하기 
		for(int i=0; i<=ar.length; i++) {
		System.out.println("ar[" + i + "] ="+ ar[i]);
		}
		//거꾸로 값 출력하기 
		System.out.println("거꾸로 출력");
		for(int i=0; i<ar.length-1; i--) {
			System.out.println("ar["+ i + "] ="+ ar[i]);
		}

}
	}
