package src.ppt3.EX3_2;

import src.ppt3.Ex3_1.Circle;

public class CircleEx extends Circle implements Perimeter, Shape {

	public CircleEx(double radius) {
		setRadius(radius);
	}
	
	@Override
	public double calculateArea() {
		return calculateArea();
	}

	@Override
	public double calculatePerimeter() {
		return getRadius() * 2 * Math.PI;
	}

}
