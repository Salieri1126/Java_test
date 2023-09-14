package src.ppt3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person lee = new Person("lee", 20, "810000-2000000");
		Student cho = new Student("cho", 21, "910000-1000000", "한직교", 1, 3);
		
		lee.greeting();
		System.out.println("----------------");
		
		cho.greeting();
		System.out.println("----------------");
		
		cho.changeName("Cho Young Ja");
		lee.greeting();
		System.out.println("----------------");
		
		cho.greeting();
		System.out.println("----------------");
	}

}

class TestClass{
	
	@Override
	public String toString() {
		return "I am TestClass.";
	}
}