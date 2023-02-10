package array;

public class Array05 {

	public static void main(String[] args) {
		char[] ar = new char[50];
		int[] count = new int[26]; //0 26

		
		for(int i=0; i<ar.length; i++) {
		    ar[i]= (char)(int)(Math.random()*25+65);
		    
		    count[ar[i]-65]++;
		    
		  
		  if ((i%10 == 0)) {
				System.out.println();
		      }
		  
		  System.out.print(ar[i] + " ");
		  }
		
		  for(int i=0; i<count.length; i++) {
			System.out.println((char)(i+65)  + "의 개수 : " + count[i]);
			}
		  
		    }
	}




//수업 중 풀이 방식 
//	      for(int i =0; i<ar.length; i++) {
//	    	  ar[i] = (char)(Math.random() * 26 +65);
//	    	 
//	    	  //각 문자의 개수 구하기 
//	    	  for (int j=0; j<count.length; j++) {
//	    		  if(ar[i] == 65+j) count[j]++;
//	    	  } //for j 
//	      } // for i 
//	      
//	      //출력
//		  for(int i=0; i<ar.length; i++) {
//			  System.out.println(ar[i] + " ");
//			  if((i+1)%10 == 0 )sysout();
//		  }
//		  //개수 출력 
//		  for(int i=0; i<count.length; i++) {
//			  sysout((char)(i+65) + ":"+ count[i]);
          //if((i+1)%4 == 0 )sysout(); 4개씩 끊어서 출력됨
//}
//		  }


		
//		  


		





/*
문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0
*/