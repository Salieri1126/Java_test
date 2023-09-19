package src.ppt3;

public class OuterClass {
	public int 			oPublicF = 10;		// 어디서나 접근
	protected int 		oProtectedF = 20;	// 같은 패키지,상속받은 클래스에서 접근
	int					oDefaultF = 30;		// 같은 패키지에서 접근
	private int			oPrivateF = 40;		// 나만 접근
	public static int 	oStaticF = 50;		// 인스턴스에 속하지 않음.
	
	private int cnt = 0;
	
	public void			fnPublic() { System.out.println("public"); }
	protected void		fnProtected() { System.out.println("protected"); }
	void				fnDefault() { System.out.println("default"); }
	private void		fnPrivate() { System.out.println("private"); }
	public static void	fnStatic() { System.out.println("static"); }
	
	public static void fnTest1() {
		System.out.println("정적 메서드 테스트");
	}
	
	public void fnTest2() {
		System.out.println("일반 메서드 테스트");
	}
	/**
	 * 정적 중첩 클래스
	 * 외부 클래스의 인스턴스와 별도로. 독립적으로 동작
	 * 외부 클래스의 정적멤버에만 접근 가능.
	 */
	public static class StaticNestedClass{
		void display() {
			System.out.println(oStaticF);
			fnStatic();
		}
	}
	
	/**
	 * 비정적 중첩 클래스
	 * 외부 클래스의 인스턴스와 관련하여 동작
	 * 외부 클래스의 모든 멤버에 접근 가능
	 */
	public class NonStaticNestedClass{
		
		private String name;
		
		public NonStaticNestedClass(String name) {
			cnt++;
			this.name = name;
		}
		void display() {
			System.out.println(name);
		}
		
	}
	
	public int getCnt() {
		return cnt;
	}
}
