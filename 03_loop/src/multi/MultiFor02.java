package multi;

public class MultiFor02 {

	public static void main(String[] args) {
		int dan, i; 
		for(dan=2; dan<=9; dan++)  {   // ;을 추가하면 3보다 높은 4에서 빠져나오게 된다
		 
			for (i=1; i<=9; i++) { 
				System.out.println(dan + "*" + i + "=" +dan*i);
			}//for i
	       System.out.println();
		}
	}//for dan 

}


/*
[문제] 2단~ 9단 
*/