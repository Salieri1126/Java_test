package src.ppt1;

//import java.util.Arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int size = 3; String[] score1 = new String[size]; String[] test = new
		 * String[size];
		 *
		 * System.out.println(score1.toString()); System.out.printf("%x\n",
		 * score1.hashCode());
		 *
		 * System.out.println(test.toString()); System.out.printf("%x\n",
		 * test.hashCode());
		 */
		//String[][] arr1;
		String arr2[][];
		//String[] arr3[];

		//arr1 = new String[2][3];

		// 가변 배열(Variable Length Arrays)
		// 불규칙 배열(Ragged Arrays)
		arr2 = new String[2][];
		arr2[0] = new String[] {"Linux", "MariaDB", "C", "C++", "Java"};
		arr2[1] = new String[] {"Network", "Prototype", "Project"};

		// 확장 for문
		for(String[] elem : arr2) {
			for(String str : elem) {
				System.out.print(str+ " ");
			}
			System.out.println();
		}

		printArr(arr2);
	}

	public static void printArr(String[][] args) {
		for(String[] elem : args) {
			for(String str : elem) {
				System.out.print(str+ " ");
			}
			System.out.println();
		}
	}
}

