package class_;

public class Compute {//1인분 필드 넣기 
	private int x, y, sum, sub, mul;
	private double div;
	
	//생성자
	
	//메소드 
	public void setData(int x, int y) {
		this.x = x;   //class x라는 것을 지칭함 //this를 붙이는 것은 하나의 클래스에 여러개의 생성자가 오버로딩 되어 있을 때 일부분 제외하고는
                      //중복된 코드를 가지고 있는 경우가 있다. 이런 순간 내부에 정의된 다른 생성자를 호출하여 코드 중복 피함
		this.y = y;
	}
	public void calc() {
		sum = x + y; //this가 생략되어 있음 
		sub = x - y;
		mul = x * y;
		div = x / y;
	}
	public int getX() {
		return this.x;  //this는 생략 가능 
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
	public String getDiv() {
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