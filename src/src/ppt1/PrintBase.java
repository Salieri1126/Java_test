package src.ppt1;

public class PrintBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1_1 = '가';
		char ch1_2 = 0xAC00;
		char ch1_3 = 44032;
		
		char ch2_1 = '걱';
		char ch2_2 = 0xAC71;
		char ch2_3 = 44145;
		
		System.out.println(ch1_1 + " " + ch1_2 + " " + ch1_3);
		System.out.println(ch2_1 + " " + ch2_2 + " " + ch2_3);
		System.out.println(ch1_1 + ch1_2 + ch1_3);
		
		final float TAX = 3.03f;
		final char GRADE_A = '수';
		final int MAX_SIZE;
		MAX_SIZE = 5;
		
		System.out.println(TAX);
		System.out.print(GRADE_A);
		System.out.printf("%d", MAX_SIZE);
		
		long num1 = 5;
		long num2 = 5;
		long result = num1+num2;
		
		System.out.println(result);
		}

}
