package src.ppt5;

import java.util.Vector;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Exam informationEngineer = new Exam();
		Exam securityEngineer = new Exam();
		
		System.out.println("정보처리 기사에 응시한 학생 번호");
		Scanner scan = new Scanner(System.in);
		
		while(!scan.hasNextInt()) {
			int num = scan.nextInt();
			if( num >=1 && num<=30) {
				informationEngineer.setStuNum(num);				
			}
			else {
				System.out.println("범위를 벗어났습니다.");
				break;
			}
		}
		scan.close();
		System.out.println(informationEngineer.getVector());
		
		try (Scanner scan1 = new Scanner(System.in)) {
			System.out.println("보안기사에 응시한 학생 번호");
			while(!scan1.hasNextInt()) {
				int num = scan1.nextInt();
				if( num >=1 && num<=30) {
					securityEngineer.setStuNum(num);				
				}
				else {
					System.out.println("범위를 벗어났습니다.");
				}
			}
		}
		System.out.println(securityEngineer.getVector());
		
		Vector<Integer> newVec = new Vector<>();
		newVec = informationEngineer.compare(securityEngineer.getVector());
		
		newVec.forEach(elem-> System.out.print(elem + " "));
	}

}