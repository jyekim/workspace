package while_;

public class While01 {

	public static void main(String[] args) {
		// 12345678910
		int a= 0; 
		while(a<10) {
			a++; // 같은 값이 나오면 안되기 때문에 =를 지움
			System.out.print(a+ " ");
		}//while 
		System.out.println();
		
		a = 0; 
		while(true) {
			a++;
			System.out.println(a + " ");
			if(a>=10) break; //while을 벗어나라
			
			
		}//while 

	}

}
