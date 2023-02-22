package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size()); //0
		System.out.println("벡터 용량 = " + v.capacity());//기본용량 10, 10개씩 증량
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i=0; i<10; i++) {
			
			v.add(i + 1 +"");// i가 int니깐 이걸 String타입으로 바꿀려면 + "" 로 해주면 됨 왜i+1을 하고 for문을 안 바꿨는지 궁금했음 의문 해결! 벡터의 i값이 고정되어 있으니깐 0부터시작해야
			System.out.print(v.get(i) + " ");//벡터의 i의 값을 가져오니깐 0~9까지
		}//for
		
		System.out.println();
		System.out.println("벡터 크기 = " + v.size()); //10
		System.out.println("벡터 용량 = " + v.capacity());//기본용량 10, 10개씩 증량  //Q.이거는 백터의 기본용량에서 왜 증가가 안되고 크기만 증가가 되는지? 
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.addElement(5 + ""); //중복 허용
		System.out.println("벡터 크기 = " + v.size()); // 11
		System.out.println("벡터 용량 = " + v.capacity());// 20
		System.out.println();
		
		for(int i=0; i<v.size(); i++) System.out.print(v.get(i) + " "); //for문이 여기서만 돔
		System.out.println();
		
		System.out.println("마지막 항목 삭제");
		//v.remove("5"); //그냥 숫자 5를 넣으면 앞부분의 5항목이 삭제됨
		v.remove(10); //10번 위치의 항목을 삭제
		
		
	
		Iterator <String> it = v.iterator(); //생성
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		}
	
	}
	

//interface 4가지 방법
//1. implements 모든 추상메소드를 override
//2. 대신 추상메소드를 override해주는 클래스가 존재한다는 것 
//3. 메소드
//4.익명 innerclass 이용함(키다리 아저씨가 추상메소드를 override 대신 해주면 됨 ) 한번 쓰고 그 안에서 버리겠다는 것

