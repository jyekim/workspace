package sungJuk;

import java.util.Scanner;

public class SungJukDTO {//필드 //1인분
	private int no;
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	
	Scanner scan = new Scanner(System.in);
	
	public SungJukDTO() {} 
	
	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}//생성자에서 인자를 받음 
	
	public void calc() {
		this.tot = kor + eng + math;
		this.avg =(double)tot/3.0;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
		public String toString() {
			return no+"\t" +name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg;
		}
	

}
