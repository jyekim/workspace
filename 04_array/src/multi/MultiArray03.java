package multi;

public class MultiArray03 {

	public static void main(String[] args) {
		String[] name = {"홍길동", "프로도", "죠르디"};
		int[][] jumsu = {{91,95,100,0},{100,88,75,0},{75,80,48,0}};
	    double[] avg = new double[3];
		char[] grade = new char[3];
		
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu[i].length-1; j++) {//국어, 영어, 수학    //총점이 3번방이라고고정해놔서 
				jumsu[i][3] += jumsu[i][j]; //총점
			             
			}//for j
		
			avg[i] = (double)jumsu[i][3] / 3; //평균
			
			if(avg[i] >= 90) grade[i] = 'A';
			else if(avg[i] >= 80) grade[i] = 'B';			
			else if(avg[i] >= 70) grade[i] = 'C';
			else if(avg[i] >= 60) grade[i] = 'D';
			else grade[i] = 'F';
			}// for i 
		//출력 
		System.out.println("----------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------");
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(name[i] + "\t");
			
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
				
			}//for j 
			System.out.println(String.format("%.2f", avg[i]) + "\t" + grade[i]);
			
		//System.out.println(name[0]+"\t"+jumsu[0][0]+"\t"+avg[0]+"\t"+grade[0]);   //이렇게 하나씩 차례로 
			
		//총점, 평균, 학점 
//			               i  3         i j
//			홍길동의 총점 방은 [0][3]= jumsu[0][0]
//					              jumsu[0][1]
//					              jumsu[0][2];
//			프로도의 총점 방은 [1][3]= jumsu[1][0]
//		                          jumsu[1][1]
//		                          jumsu[1][2];
					
	}//for i 
		
	}

}


/*
[문제] 성적 처리 
-총점, 평균, 학점을 구하시오
-평균은 소수이하 2째자리까지 출력  
-총점 = 국어 + 영어 + 수학
-평균 = 총점 / 과목수 
학점은 평균 90이상이면 'A'
학점은 평균 80이상이면 'B'
학점은 평균 70이상이면 'C'
학점은 평균 60이상이면 'D'
그외 F


[실행 결과]
----------------------------------------------------
이름    국어     영어    수학     총점      평균      학점
----------------------------------------------------
홍길동   90      95      100
프로도   100      89      75
죠르디   75      80      48
----------------------------------------------------
*/