package nested;

public abstract class AbstractTest { //기본 오리지널 POJO형식 추상 메소드는 class도 추상이여야 함
	String name;

	public String getName() {
		return name;
	}

	public abstract void setName(String name); //추상메소드로 설정 
	

}
