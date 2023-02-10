package multi;

import java.util.Scanner;

public class MultiArray05 {

	public static void main(String[] args) {
		//가변길이 배열 잡아야함 과목이 다 다르기 때문
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("인원수: "); // 인원수가 먼저 정하고 
		int cnt = scan.nextInt();
		
		
		String[] name = new String[cnt];//배열이 그다지 필요없음 마지막 결과에 필요없기 때문
		int subjectCnt;
		String subject[][] = new String[cnt][]; // 
		int jumsu[][] = new int[cnt][];
		double[] avg = new double[cnt];
		
		for(int i=0; i<cnt; i++) { //인원수 
			System.out.println("이름 입력 : ");
			name[i] = scan.next();
			
			System.out.println("과목수 입력 : ");
			subjectCnt = scan.nextInt();
			
			
			subject[i] = new String[subjectCnt];// //열 생성 
			for(int j=0; j<subjectCnt; j++) {
			System.out.print("과목명 입력 : ");
			subject[i][j] = scan.next();
			}//for j 
			
			
			jumsu[i] = new int[subjectCnt+1];
			for(int j=0; j<subjectCnt; j++) {
			System.out.print(subject[i][j] + "점수 입력 : ");
			jumsu[i][j] = scan.nextInt();
			
			
			//총점 
			jumsu[i][subjectCnt] += jumsu[i][j];
			
			}//for j
			
			//평균
			avg[i] = (double)jumsu[i][subjectCnt]/subjectCnt;
			System.out.println("--------------------");
			}//for i
		
		//출력
		for(int i=0; i<cnt; i++) { //인원수 
			
			//타이틀
			System.out.println("이름\t");
			for(int j=0; j<subject[i].length; j++) {
				System.out.println(subject[i][j] + "\t");				
			}//for j 
			System.out.print("총점\t평균");
			
			//데이터 
			System.out.println("\n" + name[i] + "\t");
			for(int j=0; j<jumsu[i].length; j++) { //과목, 총점
				System.out.print(jumsu[i][j] + "\t");
			}//for j
			System.out.println(String.format("%.2f", avg[i]) + "\n");

		}//for i
		
		
		
		
		//for문을 쓰지 않고 다 입력해서 보면 
//		System.out.println("이름 입력 : ");
//		name[0] = scan.next();
//		
//		System.out.println("과목수 입력 : ");
//		subjectCnt = scan.nextInt();
//		
//		subject[0] = new String[subjectCnt];
//		System.out.println("과목명 입력 : ");
//		subject[0][0] = scan.next();
//		subject[0][1] = scan.next();
//		
//		jumsu[0] = new int[subjectCnt+1];
//		System.out.println(subject[0][0] + "점수 입력 : ");
//		jumsu[0][0] = scan.nextInt();
//		System.out.println(subject[0][1] + "점수 입력 : ");
//		jumsu[0][1] = scan.nextInt();
//		
//		
//		//총점
//		jum[0][subjectCnt] += jumsu[0][0]
//							  jumsu[0][1];
//		
//		//평균 
//		avg[0] = (double)jumsu[0][subjectCnt] / subjectCnt;
//		
		

	}

}

/*
[문제]
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어     영어   총점     평균
홍길동    95     100   xxx     xx.xx

이름      국어  영어   과학    총점      평균
이기자   95   100   90    xxx      xx.xx
*/
