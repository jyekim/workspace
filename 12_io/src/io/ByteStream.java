package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));
		int data;
		
		while((data = bis.read()) !=-1) {//엔터의 동작 1)다음줄 == \n   2)맨 앞==\r  그래서 13과10이라는 결과 두가지 동작이 잡힘 
			System.out.print((char) data);
		}
		System.out.println();
	}

}
