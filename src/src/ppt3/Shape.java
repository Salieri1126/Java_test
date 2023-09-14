package src.ppt3;

/**
 * 추상 클래스와 추상 메서드를 실습하기 위한 클래스
 */
public abstract class Shape {
	
	protected int cnt;
	
	public Shape() {
		System.out.println("Shape()의 생성자");
	}
	//	Abstract Method
	//	정의, 구현되지 않음.
	//	자식 클래스에서 반드시 재정의
	public abstract double calculateArea();
	
	public void print() {
		System.out.println("Shape Class");
	}
}
