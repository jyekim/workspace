package basic;

public class println {

	public static void main(String[] args) {
	    System.out.println("줄바꾸기 테스트 ");
	    System.out.println("불바꿈이 없을 때.\n");
	    System.out.println("안녕하세요");
	    System.out.println(25 + 3);    // 28
	    System.out.println("25 + 3");  //25 + 3
	    System.out.println("25 + 3 =" + 25 + 3); // 25+ 3= 253
	    System.out.println("25 + 3 =" + (25 + 3)); // 25 + 3 = 28 
	    System.out.println("25 + 3 =" + (25 / 3)); //정수 나누기 정수는 정수만 계산됨 25 + 3 =8
	    System.out.println("25 + 3 =" + (25.0 / 3)); //결과값 25 + 3 =8.333333333333334
	    System.out.println("25 + 3 =" + String.format("%4.2f", 25.0 / 3)); //소수 이하 2번째 자리만 
	    System.out.println("25 / 3 = " + String.format("%.2f", 25.0 / 3)); //전체자리수는 무시하고 싶을때 

	}

}
