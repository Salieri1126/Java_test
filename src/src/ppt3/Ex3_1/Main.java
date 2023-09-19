package src.ppt3.Ex3_1;

public class Main {

	public static void main(String[] args) {
		Circle C1 = new Circle();
		Triangle T1 = new Triangle();
		Square S1 = new Square();
		
		C1.setRadius(5.0);
		System.out.println(C1.calculateArea());
		
		Shape C2 = new Circle(2.5);
		area(C2);
		
	}
	
	public static void area(Shape target) {
		System.out.println(target.calculateArea());
	}

}
