package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) {
		try {
			File file = new File("data.txt");
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			int size = (int)file.length();   //파일 크키 구할 수 있음  
			byte[] b = new byte[size];
			
			bis.read(b, 0, size); //모든 데이터가 전부 b에 읽어들어옴 
			System.out.println(new String(b)); //배열명이니 주소값이 나옴  그래서 이 기본형byte[]를 객체String으로 변환시켜줘야함
			
			bis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
