package src.ppt1;

import java.util.Scanner;
public class ScanBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// try 구문을 벗어날때 알아서 scanner 객체를 닫아줌.
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("이름을 입력하세요.");
			String name = scan.nextLine();
			
			System.out.println("나이를 입력하세요.");
			int age= scan.nextInt();
			
			if(age <20) {
				System.out.println(name + "씨는 미성년자이므로 출입금지");
			}
			else {
				System.out.println(name + "씨는 성인이므로 출입 가능");
			}
			
			
		};
	}

}
