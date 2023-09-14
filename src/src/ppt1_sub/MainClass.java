package src.ppt1_sub;

import src.ppt1.PublicClass;

public class MainClass extends PublicClass{

	public MainClass(){
		//super();						// public - 사용가능
		super(10);						// protected - 다른 패키지의 자식에서 사용가능
		//super("String");				// default -
		//super(10,20);					// private -
	}
	public static void main(String[] args) {

		PublicClass test = new PublicClass();

		//PublicClass test2 = new PublicClass(10);
		//PublicClass test3 = new PublicClass("String");

		//PublicClass test4 = new PublicClass(10,20);

		test.publicFn();

	}

	public void subFn() {
		publicFn();
		protectedFn();
		//defaultFn();
		//privateFn();
	}
}
