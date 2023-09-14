package src.ppt1;

public class ConstructorMain {

	public int a;
	public String name;

	public ConstructorMain() {
		this(-1);
		System.out.println("매개 변수가 없는 생성자");
	}

	public ConstructorMain(int a) {
		this(a, null);
		System.out.println("매개 변수가 하나 있는 생성자");
	}

	public ConstructorMain(int a, String name) {
		System.out.println("매개 변수가 두개 있는 생성자");
		if(a<0)
			this.a = 0;
		else
			this.a = a;
		this.name = name;
	}

	public ConstructorMain(ConstructorMain other) {
		this.a = other.a;
		this.name = other.name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorMain myClass = new ConstructorMain();
		ConstructorMain myClass2 = new ConstructorMain(myClass);

		System.out.println(myClass == myClass2);

		System.out.println(myClass2.name +" "+ myClass2.a);
		myClass2.name = "choi";

		System.out.println(myClass.name +" "+ myClass.a);
		System.out.println(myClass2.name +" "+ myClass2.a);
	}

}
