package basic;

import java.util.Arrays;
import java.util.Random;

public class MethodTest02 {

	public static void main(String[] args) {
		// 난수 - 컴퓨터가 불규칙적으로 발생하는 숫자 
		//     0 < = 난수 < 1    0보다는 크지만 1보다는 작게 나옴
		double a = Math.random();
		System.out.println("난수 = " + a);
		
		Random r = new Random(); //자바의 default 패키지 => java.lang
		double b = r.nextDouble();
		System.out.println("난수 = " + b);
		
		int[] ar = new int[5]; // 배열
		ar[0] = 25;
		ar[1] = 13;
		ar[2] = 45;
		ar[3] = 30;
		ar[4] = 15;
		System.out.println(ar[0] + "," + ar[1] + "," +ar[2] + ","+ ar[3] + ","+ ar[4]);
		
		Arrays.sort(ar);
		System.out.println(ar[0] + "," + ar[1] + "," +ar[2] + ","+ ar[3] + ","+ ar[4]);
		//정렬 - 오름차순 
	}

}
