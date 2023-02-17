package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//NumberFormat nf = new NumberFormat(); 에러나는 이유 추상클래스여서 생성이 안됨

		
		
	//3자리 마다 , 를 찍고 소수이하 3째자리가지 출력
		NumberFormat nf = new DecimalFormat();//Sub Class 이용하여 메모리에 생성했다는 것 
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");//유효숫자가 아닌 것은 표현하지 않는다 
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");//0을 강제로 표시 
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
//		NumberFormat nf4 = NumberFormat.getInstance();//class는 메소드를 이용하여 생성 가능하다
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();//원가 
		nf4.setMaximumFractionDigits(2);//소수 이하 둘째자리까지 표시 
		nf4.setMinimumFractionDigits(2);
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		
//		NumberFormat nf5 = NumberFormat.getInstance(Locale.US);//class는 메소드를 이용하여 생성 가능하다
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);//달러
		nf5.setMaximumFractionDigits(2);//소수 이하 둘째자리까지 표시 
		nf5.setMinimumFractionDigits(2);
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
	}

}
