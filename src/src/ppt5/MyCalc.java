package src.ppt5;

public class MyCalc<T extends Number> {
	private T num1;
	private T num2;
	
	public MyCalc(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double add() {
		return num1.doubleValue() + num2.doubleValue();
	}
	
	public double sub() {
		return num1.doubleValue() + num2.doubleValue();
	}
	
	public double mul() {
		return num1.doubleValue() * num2.doubleValue();
	}
	
	public double div() {
		return num1.doubleValue() / num2.doubleValue();
	}
}
