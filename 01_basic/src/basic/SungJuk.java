package basic;

public class SungJuk {

	public static void main(String[] args) {
	    char name = 'L';
	
		int eng = 78;
		int mat = 100;
		int kor = 85;
		int tot = eng + mat + kor;
	    double avg;
	    avg = (double)tot / 3 ;
	    System.out.println("\t*** "+ name + "성적표 ***");
		System.out.println("국어\t영어\t수학\t총점\t평균");

		System.out.println(kor + "\t" + eng + " \t" + mat + "\t" + tot +"\t"+ String.format("%.2f",avg));
		
	  
		
				}

}


/*
[문제] 성적계산
이릉(name)이 L 이고 국어점수(kor)가 85, 영어점수(eng)가 78점, 수학(math)점수 100일 때 총점(tot)과 평균(avg)을 구하시오
단, 평균은 소수이하 2째자리까지 출력 
총점 = 국어점수 + 영어점수 + 수학점수
평균 = 총점 / 과목수 

[실행결과]
    *** L성적표 ***
국어    영어    수학     총점     평균
85     78     100     xxx     xx.xxx  
*/