package src.ppt3;

public class MainClass {

	public static void main(String[] args) {
		OuterClass.StaticNestedClass staticClass = new OuterClass.StaticNestedClass();
		staticClass.display();
		
		System.out.println("=================");
		
		OuterClass outerClass = new OuterClass();
		OuterClass.NonStaticNestedClass nestedClass1 = outerClass.new NonStaticNestedClass("first");
		OuterClass.NonStaticNestedClass nestedClass2 = outerClass.new NonStaticNestedClass("second");
		OuterClass.NonStaticNestedClass nestedClass3 = outerClass.new NonStaticNestedClass("third");
		
		nestedClass1.display();
		nestedClass2.display();
		nestedClass3.display();
		
		System.out.println(outerClass.getCnt());
	}
}