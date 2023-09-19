package src.ppt3.Ex3_1;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle() {}
	public Circle(double radius) {
		setRadius(radius);
	}
	
	
	public double calculateArea() {
		//return Math.PI * radius * radius;
		return Math.PI * Math.pow(radius, 2);
	}
	
	public void setRadius(double radius) {
		if(radius > 0) {
			this.radius = radius;
		}
	}
	
	public double getRadius() {
		return radius;
	}
}
