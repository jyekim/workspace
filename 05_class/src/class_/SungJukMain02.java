package class_;

public class SungJukMain02 {

	public static void main(String[] args) {//객체배열로 생성
		SungJuk[] ar = new SungJuk[3]; //헷갈렸던 이유 알아냄   
		ar[0] = new SungJuk();
		ar[0].setData("홍길동", 90,95,100);
		
		ar[1] = new SungJuk();
		ar[1].setData("프로도", 100,89,75);
		
		ar[2] = new SungJuk();
		ar[2].setData("죠르디",75,80,45);
		
		for(int i=0; i<ar.length; i++) {
			ar[i].calc();// 호출 
			
			System.out.println(ar[i].getName() +"\t"
					          +ar[i].getKor() +"\t"
					          +ar[i].getEng() +"\t"
					          +ar[i].getMath() +"\t"
					          +ar[i].getTot() +"\t"
					          +ar[i].getAvg() +"\t"
					          +ar[i].getGrade());
					          
		
		}
	}

}
