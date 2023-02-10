package array;

public class Array01 {

	public static void main(String[] args) {
		int[] ar;
		ar = new int[5]; 
		System.out.println("배열명 ar = " + ar);
	
		ar[0] = 25;
		ar[1] = 35;
		ar[2] = 55;
		ar[3] = 42;
		ar[4] = 30;
		
		System.out.println("배열 크기 = " + ar.length); //5개를 가지고 있다
        for(int i=0; i<ar.length; i++){  // 배열의 길이만큼 반복문을 돌려서 각 배열의 요소를 출력 
        	//그래야 배열에 있는 모든 요소를 탐색하는데 사용할 수 있음 절대 =등호를 쓰지 않음 
	       System.out.println("ar["+ i + "] = " + ar[i]);
	}
        System.out.println("거꾸로 출력");
        for(int i=ar.length-1; i>=0; i--) {
        	System.out.println("ar{"+ i + "] = " + ar[i]);
        }
        
        System.out.println("홀수 데이터만 출력");
        for(int i=0; i<ar.length; i++) {
        	if(ar[i]%2 == 1) // 홀수 데이터만 출력이니깐 나눴을 때 나머지 0으로 딱 떨어지는 지는 건 짝수데이터출력 
        		System.out.println("ar[" + i + "] ="+ar[i]);
        	
        }
        System.out.println();
        
        
        System.out.println("확장 for");
        for(int data : ar) {// 이 안에 있는 데이터르 ar이 data에게 꺼내줌 //ar의 크기만큼 for문을 반복한다
        System.out.println(data);	
        }// 이게 위에 반복문이랑 같은 역할을 하는 건지? 뭐지...
        
       
 }
}
