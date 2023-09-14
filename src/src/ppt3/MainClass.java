package src.ppt3;

public class MainClass {

	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
		System.out.println("Area of circle : " + circle.calculateArea());
		circle.print();
		
		MyImplements imp = new MyImplements();
		
		imp.method1();
		imp.method2();
		
		System.out.println(imp.VALUE1);
		System.out.println(imp instanceof MyImplements);
		System.out.println(imp instanceof MyInterface);
	}
}