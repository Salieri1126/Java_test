package src.ppt1;

// 클래스의 접근제어자는 public/default
public class SystemOutPrintln {

	// 메서드의 접근제어자는 public/protected/default/private
	public void test1() {
		System.out.println("test1");
	}
	
	protected void test2() {
		System.out.println("test2");
	}
	
	void test3() {
		System.out.println("test3");
		test4();
	}
	
	private void test4() {
		System.out.println("test4");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, 안녕!");
		System.out.println("Salieri! 안녕!");
	}

}

