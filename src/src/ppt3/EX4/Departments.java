package src.ppt3.EX4;

import java.util.Scanner;

public class Departments {

	// 부서 이름
	private String partName;
	
	// 사원 리스트
	private Employees[] empNum;
	private int size = 0;
	private int capacity = 0;
	
	public Departments(){}
	public Departments(String name) { partName = name;}
	
	public String get_partName() {
		return partName;
	}

	public void set_partName(String partName) {
		this.partName = partName;
	}

	public void set_deptCapa(int capacity) {
		capacity = 0;
		System.out.print(this.partName + " 부서의 사원은 몇명입니까 : ");
		Scanner scan = new Scanner(System.in);
		capacity = scan.nextInt();
		scan.close();
		this.empNum = new Employees[capacity];
	}
	
	public void add_employee(String empName, String position) {
		if(size == 99) {
			System.out.println("더이상 부서에 인원을 추가할 수 없습니다.");
			return;
		}
		empNum[size] = new Employees(empName,position);
		size++;
	}
	
	public void print_employees() {
		for(int i = 0 ; i < size ; i++) {
			System.out.println(empNum[i].get_empName() + " : " + empNum[i].get_position());  
		}
	}
	
	public void set_empPosition(String empName, String setposition) {
		for(int i = 0 ; i < size ; i++) {
			if(empNum[i].get_empName() == empName) {
				empNum[i].set_position(setposition);
			}
		}
	}
	
	public class Employees{
		private String empName;
		private String position;
		
		public Employees(String empName, String position){
			set_empName(empName);
			set_position(position);
		}
		
		public String get_empName() {
			return empName;
		}
		
		public void set_empName(String empName) {
			this.empName = empName;
		}
		
		public String get_position() {
			return position;
		}
		
		public void set_position(String position) {
			this.position = position;
		}
	}
	
	
}
