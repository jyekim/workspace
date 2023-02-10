package class_;

public class SungJuk { //1인분 클래스임 //필드(Field)//이름으로 접근해서 가는것
	
	
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	private char grade;
	
	// 메소드 
	public void setData(String n, int k, int e, int m) {//구현 
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	public void calc() {//
		tot = kor + eng + math;
		avg = (double)tot/3;
		if(avg >=90) grade = 'A';
		else if(avg >= 80) grade = 'B'; 		 
		else if(avg >= 70) grade = 'C'; 		 
		else if(avg >= 60) grade = 'D'; 	
		else grade = 'F';
	}
	public String getName(){
		return name;
	}
	public int getKor() {
		return kor;
	}public int getEng() {
		return eng;
	}public int getMath() {
		return math;
    }
	public int getTot() {
		return tot;
	}public String getAvg() {
		return String.format("%.2f", avg);
	}public char getGrade() {
		return grade;
	   }
	
	}
	
	





/*
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
*/