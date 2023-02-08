package while_;

public class DoWhile {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		int a = 0;
		do {
			a++;
			System.out.println(a + " ");
		}while(a<10); 

		// A B C D E F ~~ X Y Z
		//한줄에 7개씩 출력하시오
		char ch = 'A';
		int count = 0;
		do {
			System.out.println(ch + " ");//ch++은 B로 나옴 
		    ch++;
		    count++; // 개수 1 2 3
		    if(count%7==0) // 7의 배수이지만 나머지가 0으로 나와야한다
		    System.out.println();  
		}while(ch<='Z');
		
	}

}
