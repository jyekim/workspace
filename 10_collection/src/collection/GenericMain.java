package collection;

class GenericTest<T> {
	private T a; 
	
	public void setA(T a) {//변수가 어떤건지 알 수 없으니 T로 정해둠
		this.a = a;		
	}
	
	public T getA() {
		return a;
	}
}
//---------------
public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();
		aa.setA("홍길동");
		System.out.println("이름 = " + aa.getA());
		
		//aa.setA(25)
		GenericTest<Integer> bb = new GenericTest<Integer>();
		bb.setA(25);
//		System.out.println("나이 = " + bb.get);

	}

}
