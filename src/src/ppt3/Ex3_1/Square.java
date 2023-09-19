package src.ppt3.Ex3_1;

public class Square extends Shape {
	
	private double width;
	private double length;
	
	public Square() {}
	public Square(double wid, double len) {
		setWidth(wid);
		setLength(len);
	}
	public double calculateArea() {
		return width * length;
	}
	
	public void setWidth(double wid) {
		width = wid <= 0 ? 0 : wid;
	}
	
	public void setLength(double len) {
		length = len <= 0 ? 0 : len;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
}
