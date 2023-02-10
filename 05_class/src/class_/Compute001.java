package class_;

public class Compute001 {
	//필드 variable 채우기
	private int  x, y, sum, sub, mul;
	private double div;
	
	//메소드 
	public void setData(int x, int y) { //this를 쓰는 이유가 class x라는 것을 알려줌
		this.x = x;
		this.y = y; 
	}
	public void calc() {
		sum = x + y;
		sub = x - y;
		mul = x * y;
		div = x / y;		
	}
	//
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSum() {
		return sum;
	}
	public int getSub() {
		return sub;
	}
	public int getMul() {
		return mul;
	}
	public String getdiv() {
		return String.format("%.3f", div);
	}
	
}


/*
[문제] 사칙연산 
x,y 입력하여 합, 차, 곱, 몫을 구하시오
클래서명 Compute(1인분)
필드 : x, y, sum, sub, mul, div
메소드 : setData(x의 값, y의 값)
       calc()
       getX()
       getY()
       getSum()
       getSub()
       getMul()
       getDiv()


[실행결과]
횟수 입력 : 2

[1 번째]
x 입력 : 25
y 입력 : 36

[2 번째]
x 입력 : 35
y 입력 : 12

x,   y   sum  sub  mul  div
25   36                         //
35   12
*/