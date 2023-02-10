package array;
import java.util.Arrays;
import java.util.Scanner;
public class Array03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size;
		int[] ar;
		int sum = 0;
	
		System.out.println("배열 크기 입력 : ");
		size = scan.nextInt();
		
		ar = new int[size]; //배열 생성
		for(int i=0; i<size; i++) {
			System.out.println("ar["+ i + "] 입력 : ");
			ar[i] = scan.nextInt();
			
			sum += ar[i];
		}//for문으로 돌린 것과 아래 식과 같은거임 
		//System.out.println("ar[0] 입력 : ");
		//ar[0] = scan.nextInt();
		//System.out.println("ar[1] 입력 : ");
		//ar[1] = scan.nextInt();
		//System.out.println("ar[2] 입력 : ");
		//ar[2] = scan.nextInt(); 
		//System.out.println("ar[3] 입력 : ");
		//ar[3] = scan.nextInt(); 얘네들을 for문으롤 바꿔줘야함
		
		//최대값최소값 찾기 
		int max, min;
		max = min = ar[0];
		//for문을 이용한 최댓값 최솟값 방법 
		for(int i=1; i<ar.length; i++) {
			if(ar[i] > max) max = ar[i];
			if(ar[i] < min) min = ar[i];
		}
		
	    //Arrays.sort를 이용한 방법 
//		System.out.println();
//		Arrays.sort(ar); // 배열 정렬
//		System.out.println("최대값 : "+ ar[ar.length-1]);
//		System.out.println("최소값 : "+ ar[0]);

		
		for(int data : ar) {
			System.out.println(data + " ");
		}
          System.out.println();
          System.out.println("합 = "+ sum );
          System.out.println("최대값 = " + max);
          System.out.println("최소값 = " + min);

	}

}

/*
[문제] 배열의 크기를 입력 받아서 배열을 생성한다.
데이터를 출력하고 합, 최대값, 최소값을 구하시오 

[실행결과]
배열 크기 입력 : 3

ar[0] 입력 : 25
ar[1] 입력 : 13
ar[2] 입력 : 57

25 13 57 
합 = xxx
*/ 