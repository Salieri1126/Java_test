package src.ppt1;

public class ClassMain {

	public static void main(String[] args) {

		//	생성자는 대부분 public.
		PublicClass test = new PublicClass();
		PublicClass test2 = new PublicClass(10);
		PublicClass test3 = new PublicClass("String");

		//PublicClass test4 = new PublicClass(10,20);

		test.publicFn();
		test.protectedFn();
		test.defaultFn();

		//test.privateFn();
	}

}
