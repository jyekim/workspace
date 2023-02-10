package constructor;

public class VarArgs {
	public VarArgs() {
		System.out.println("기본 생성자");
	}
	
	public int sum(int...ar) {//갯수를 자유롭게 하기위해 
		int hap=0;
		for(int i=0; i<ar.length; i++) {
			hap += ar[i];
	
		}
		return hap;
		
	}
	
//	int sum(int a, int b) {
//		return a+b;
//	}
//	int sum(int a, int b, int c) {
//		return a+b+c;
//	}
//	int sum(int a, int b, int c, int d) {
//		return a+b+c+d;
//	}

	public static void main(String[] args) {
		VarArgs va = new VarArgs(); //생성자 부르는거
		System.out.println("합 = " + va.sum(10, 20));
		System.out.println("합 = " + va.sum(10, 20, 30));
		System.out.println("합 = " + va.sum(10, 20, 30, 40));

	}

}
