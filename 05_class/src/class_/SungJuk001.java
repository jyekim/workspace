package class_;

public class SungJuk001 {
    // 필드
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	private char grade;
	 ///먼저 variable을 다 잡아줘야 함 
	
	
    //메소드 
	public void setData(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
		}
	public void calc(int t, double a, char g) {
		tot = kor + eng + math;
		avg = (double)tot/3;
		if(avg >=90) grade='A';
		else if(avg >=80) grade='B';
		else if(avg >=70) grade='C';
		else if(avg >=60) grade='D';
		else grade ='F';
		}
	public  String getName() {
	 return name;
	 }
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;		
	}
    public int getTot() {
    	return tot;
    }
    public double getAvg() {
    	return avg;
    }
    public char getGrade() {
    	return grade;
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

클래스명 : SunkJuk
필드 : name, kor, eng, math, tot, avg, grade
메소드 : setData(이름, 국어, 영어, 수학) 
       calc() -총점, 평균, 학점 계산 
       getName()
       getKor()
       getEng()
       getMatn()
       getTot()
       getAvg()
       getGrade()

[실행 결과]
----------------------------------------------------
이름    국어     영어    수학     총점      평균      학점
----------------------------------------------------
홍길동   90      95      100
프로도   100     89      75
죠르디   75      80      48
----------------------------------------------------
*/