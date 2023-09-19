package src.ppt3.Ex3_1;

public class Triangle extends Shape {
	
	private double adjacent;
	private double opposite;
	
	public Triangle() {}
	public Triangle(double adj, double opp) {
		 setAdjacent(adj);
		 setOpposite(opp);
	}
	public double calculateArea() {
		return adjacent * opposite / 2;
	}
	
	public void setAdjacent(double adj) {
		adjacent = adj <= 0 ? 0 : adj;
	}
	
	public void setOpposite(double opp) {
		opposite = opp <= 0 ? 0 : opp;
	}
	
	public double getAdjacent() {
		return adjacent;
	}
	
	public double getOpposite() {
		return opposite;
	}
}
