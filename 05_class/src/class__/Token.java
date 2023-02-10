package class__;
import java.util.StringTokenizer;
public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ","); //"학원", "집", "게임방" 3개로 분리됨
		System.out.println("토큰 개수 = " + st.countTokens()); //3개
		
		while(st.hasMoreTokens()) { //(토큰 유무) 토큰 있으면 true 없으면 false임
	     System.out.println(st.nextToken()); //토큰의 값을 꺼내고 다음 토큰으로 이동함 
		}//while문
		System.out.println("---------------------");
		
		String[] ar = str.split(","); //콤마를 가지고 분해해라. 배열을 가져오고 배열을 확장의 값으로 넘겨주었음
		
		for(String data : ar) {   //현재 가지고 있는 ar의 값을 data로 전달해줌 //이거는 토큰과 다르게 비어있는 값도 꺼내옴 
			System.out.println(data); 
		}
	}
}
