package collection;

import java.util.ArrayList;

public class CollectionMain2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이");//중복허용
		//list.add(25);
		//list.add(43.8);
		list.add("기린");
		list.add("코끼리");
		
		for(int i=0; i<list.size(); i++) { //배열은 length , arraylist는 size
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for(String s :list) {
			System.out.println(s);	
		}
	}

}
