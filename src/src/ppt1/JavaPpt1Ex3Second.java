package src.ppt1;

import java.util.Scanner;

public class JavaPpt1Ex3Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 0;
		System.out.print("년도를 입력하세요 : ");
		try(Scanner scan = new Scanner(System.in)){
			year = scan.nextInt();
		}
		if(isLeapyear(year))
			System.out.println("윤년입니다.");
		else 
			System.out.println("윤년이 아닙니다.");
	}
	
	public static boolean isLeapyear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return true;
		else
			return false;
	}
}