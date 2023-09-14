package src.ppt1;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calc myCalc = new Calc();
			System.out.println(myCalc.add(1, 2,3,4,5));
	}

}

class Calc{

	public int add(int ... b) {
		int sum = 0;
		for (int element : b) {sum += element;}
		return sum;
	}

	int add(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}

	double add(double a, double b) {
		double sum = a+b;
		return sum;
	}

	double add(double a, double b, double c) {
		double sum = a+b+c;
		return sum;
	}
}