package ineritance;

class AA {
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.println("AA : "+ a + " ");
	}
}
//----------------
class BB extends AA{
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.println("BB : " + a + " ");
	}
}

//-----------------
public class OverrideMain {

	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp(); //BB :13
		System.out.println("aa: " + aa.a);//13
		System.out.println();
		
		
	}

}
