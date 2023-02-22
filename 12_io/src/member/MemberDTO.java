package member;

import java.io.Serializable;


public class MemberDTO implements Comparable<MemberDTO>, Serializable { //필드 채우기 
	private static final long serialVersionUID = 1L;
	private String name, address, phone;
	private int age; 
		
	public MemberDTO() {}
	
	public MemberDTO(String name, int age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone; 
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAdd(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return name+"\t" + age + "\t" + phone +"\t" + address; 
	}

	@Override
	public int compareTo(MemberDTO m) {
		return this.name.compareTo(m.getName());//오름차순
	
	}
	

}
