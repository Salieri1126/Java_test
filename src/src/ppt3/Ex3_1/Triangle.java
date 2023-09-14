package src.ppt3.Ex3_1;

public class Triangle extends Shape {
	
	private double adj;
	private double opp;
	
	public double calculateArea() {
		return adj * opp / 2;
	}
}
