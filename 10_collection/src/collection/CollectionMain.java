package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection<Object> coll = new ArrayList<Object>(); //interface도 new를 통해서 얻어올 수 있다
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");//중복허용, 순서 
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		Iterator it = coll.iterator();  // 이 객체는 지시자 같은 개념  그값을 가리키는 하나의 지시자 역할
		while(it.hasNext()) {
			System.out.println(it.next());
		}//while
		
//		it.hasNext() 항목이 있는지? (true), 없으면 (false)
//		it.next() -> 항목을 꺼내고 다음 항목으로 이동 

	}

}
