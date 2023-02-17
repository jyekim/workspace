package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {
	
	
	public static void main(String[] args) throws ParseException {
		Date date = new Date(); //시스템의 시간과 날짜 
		System.out.println("오늘 날짜 : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 d일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : " + sdf.format(date));
		System.out.println();
		
		//입력 - 내 생일 
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19910716091415"); //String -> Date형 변환 
		System.out.println("내 생일 = " + birth);
		System.out.println("내 생일 = " + sdf.format(birth));
		
		
//		Calendar cal = new Calendar(); 추상 클래스라서 안됨
		
		//기준은 시스템 날짜와 시간 
		Calendar cal = new GregorianCalendar();// sub Class 
		Calendar cal2 = Calendar.getInstance(); //메소드 
		
		int year = cal.get(Calendar.YEAR); 
		int month = cal.get(Calendar.MONTH) + 1; // 컴퓨터가 jan을 0으로 잡고 있기 때문  
		int day = cal.get(cal.DAY_OF_MONTH); 
		int week = cal.get(cal.DAY_OF_WEEK); //일요일은 또 1로 시작함, 월요일은 2  
		
		String dayOfWeek=null;
		switch(week) {
		case 1 : dayOfWeek = "일"; break;
		case 2 : dayOfWeek = "월"; break;
		case 3 : dayOfWeek = "화"; break;
		case 4 : dayOfWeek = "수"; break;
		case 5 : dayOfWeek = "목"; break;
		case 6 : dayOfWeek = "금"; break;
		case 7 : dayOfWeek = "토";
		}
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute =cal.get(Calendar.MINUTE); 
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월" + day + "일" + dayOfWeek + "요일" + hour + "시" + minute + "분" +second + "초");
	}

}
