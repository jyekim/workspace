package constructor;
 class MemberDTO {// 1인분 클래스를 잡고 있는 것 [DTO = Data Transfer Object]
	  private String name;                  
	  private int age;                  
	  private String phone;
	  private String address;
	  
	  
	  //생성자를 통해서 데이터 4개를 받아온다. 이름 나이 핸드폰 주소 
   public MemberDTO(String name, String phone, int age,String address) {
		  this.name = name; 
		  this.age = age;
		  this.phone = phone;
		  this.address = address;
	  }
	  
	  public String getName() {
		  return name;
	  }
	  public int getAge() {
		  return age;
	  }
	  public String getPhone() {
		  return phone;
	  }
	  public String getAddress() {
		  return address;
	  }
	  
	  public void setName(String name) {
		  this.name = name;
		  } 
	  public void setPhone(String phone) {
			  this.phone = phone;
			  }
	  public void setAddress(String address) {
		  this.address = address;
		  }
	  }
	  
	
	  
