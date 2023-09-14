package src.ppt3;

/**
 *	기본적인 상속을 실습하기 위한
 *	기초 클래스(부모 클래스, 슈퍼 클래스)
 */
public class Person {

	// 필드(멤버 변수) : 보통 private으로 선언하여 보호.
	// 외부에서 접근 불가능. 내부의 메서드를 통하여 접근.
	protected String name;
	private int age;
	private String rrn;
	
	// 기본 생성자 : 클래스의 인스턴스(객체) 생성시에 호출. 단 한번.
	public Person() {}
	
	// Constructor(name,age,rrn)
	public Person(String name, int age, String rrn) {
		this.name = name;
		this.age = age;
		this.rrn = rrn;
	}
	
	// 인사 함수
	public void greeting() {
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
	}
}
