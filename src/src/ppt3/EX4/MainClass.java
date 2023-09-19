package src.ppt3.EX4;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		int deptNum = 0;
		int MaxEmp = 0;
		MainClass corp = new MainClass();
		
		System.out.println("1. 부서 만들기");

		Departments[] dept = new Departments[10];
		
		corp.add_department(dept, deptNum++);
		//corp.add_department(dept, deptNum++);
		
		
		dept[0].set_deptCapa(MaxEmp);
		dept[0].add_employee("Park Hee Seung", "Manager");
		dept[0].add_employee("Kim Min Jae", "Staff");
		
		dept[0].print_employees();
		
		dept[0].set_empPosition("Kim Min Jae", "Manager");
		
		dept[0].print_employees();
	}
	
	private void add_department(Departments[] dept, int deptNum) {
		System.out.print("부서 이름을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		String deptName = scan.next();
		scan.close();
		dept[deptNum] = new Departments();
		dept[deptNum].set_partName(deptName);
	}
}
