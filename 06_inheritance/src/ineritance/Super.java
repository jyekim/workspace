package ineritance;

public class Super extends Object {
	protected double weight, height;
	
	Super(){}
	
	 Super(double weight, double height) {   //생성자는 클래스명과 똑같으며 절대 앞에void를 붙이면 안됨 
		this.weight = weight;
		this.height = height;
	
	}
    public void disp() {
    	System.out.println("몸무게 = " + this.height);
    	System.out.println("키 = " + height);
    }
}
