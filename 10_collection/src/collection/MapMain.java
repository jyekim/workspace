package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주"); //value값은 똑같은거 써도 됨 중복허용 
		map.put("book302", "피오나"); 
		map.put("book101", "엄지공주"); //key 중복허용 
		
		System.out.println(map.get("book101")); //이렇게 하면 엄지공주가 결과로 나옴 //get은 코드넘버를 찍어줘야함
		System.out.println(map.get("book102"));
		System.out.println(map.get("book501"));// null 없으면 null로 떨어짐 

	}

}
