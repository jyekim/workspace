package for_;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mul = 1;
        
		System.out.println("x값 : ");
		int x = scan.nextInt();
		System.out.println("y값 : ");
		int y = scan.nextInt();//5
		
		for(int i=1; i<=y; i++) { //1 2 3 4 5
			mul *= x;
			
		}
		
		System.out.println(x + "의 " + y + "승은 " + mul);
	}

}


/*
[문제] 제곱 계산 - x의 y승

x값 입력 : 2
y값 입력 : 5

2의 5승은 32이다
-------------
x값 입력 : 3
y값 입력 : 4

3의 4승은 81이다
*/