package io;// input 과 output의 약자 

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	
	public static void main(String[] args) {
		try {
			//DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			
			FileOutputStream fos = new FileOutputStream("result.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeInt(25);
			dos.writeDouble(185.3);
			
			dos.close(); //stream 모든 것들을 마무리 하겠다는 것
			
			
			//파일 읽기 
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
			String name = dis.readUTF();// 파일을 읽어와라 읽어온 파일을 여기에 보관하는 개념 
			int age = dis.readInt();
			double height = dis.readDouble(); //위에 double로 썼으니 동일하게 변수지정해야함
			
			System.out.println("이름 = " + name);
			System.out.println("나이 = " + age);
			System.out.println("키 = " + height);
			
			dis.close();
			
			
	}catch(IOException e ) {
		e.printStackTrace();
	}

	} 
}
