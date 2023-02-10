package class_;

public class SungjukMain {

	public static void main(String[] args) {// 하나씩 객체 생성
		SungJuk aa = new SungJuk();
		aa.setData("홍길동", 90, 95, 100);//호출
		aa.calc();//호출
		System.out.println(aa.getName() +"\t"
						  +aa.getKor() +"\t"
						  +aa.getEng() +"\t"
						  +aa.getMath() +"\t"
						  +aa.getTot() +"\t"
						  //+String.format("%.2f", aa.getAvg()) +"\t"
						  +aa.getAvg() +"\t"
						  +aa.getGrade());
		
		
		SungJuk bb = new SungJuk();
		aa.setData("프로도", 100, 89, 75);//호출
		aa.calc();//호출
		System.out.println(aa.getName() +"\t"
						  +aa.getKor() +"\t"
						  +aa.getEng() +"\t"
						  +aa.getMath() +"\t"
						  +aa.getTot() +"\t"
						  //+String.format("%.2f", aa.getAvg()) +"\t"
						  +aa.getAvg()+"\t"
						  +aa.getGrade());
		
		SungJuk cc = new SungJuk();
		aa.setData("죠르디", 75, 80, 48);//호출
		aa.calc();//호출
		System.out.println(aa.getName() +"\t"
						  +aa.getKor() +"\t"
						  +aa.getEng() +"\t"
						  +aa.getMath() +"\t"
						  +aa.getTot() +"\t"
						  //+String.format("%.2f", aa.getAvg()) +"\t"
						  +aa.getAvg()+"\t"
						  +aa.getGrade());
		                  
		
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
프로도   100      89      75
죠르디   75      80      48
----------------------------------------------------
*/