package src.ppt1_sub;

import src.ppt1.SystemOutPrintln;

public class TestClass extends SystemOutPrintln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemOutPrintln myClass = new SystemOutPrintln();
		myClass.test1();
		TestClass myClass2 = new TestClass();
		myClass2.test();
	}
	public void test() {
		test1();
		test2();
	}


}
