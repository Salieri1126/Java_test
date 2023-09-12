package src.ppt1;

import java.util.Scanner;

public class JavaEx3 {
	public static void main(String[] args) {
		int num1, num2, num3;
		try(Scanner scan = new Scanner(System.in)){
			System.out.print("세 정수를 입력하세요 : ");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();

			System.out.printf("세 정수는 %d %d %d 이고, 가장 큰 수는 %d 입니다.", num1, num2, num3, find_bigger(num1,num2,num3));
		}
	}
	
	public static int find_bigger(int num1, int num2, int num3) {
		if((num1>num2) && (num1>num3)) {
			return num1;
		}
		else if((num2>num1) && (num2>num3)) {
			return num2;
		}
		else{
			return num3;
		}
	}
}
