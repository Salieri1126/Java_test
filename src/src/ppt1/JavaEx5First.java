package src.ppt1;

import java.util.Random;
import java.util.Scanner;

public class JavaEx5First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("주사위를 몇 번 던지시겠습니까 : ");
		int round = 0;
		try(Scanner sc = new Scanner(System.in)){
			round = sc.nextInt();

			while(round<1 || round >100) {
				System.out.println("입력범위를 벗어났습니다.(1~100)");
				System.out.print("주사위를 몇 번 던지시겠습니까 : ");
				round = sc.nextInt();
			}
		}

		Random dice = new Random();
		// Random dice = new Random(time);
		int[] result = new int[7];
		for(int i = 0 ; i < round ; i++) {
			result[dice.nextInt(6)+1]++;
		}

		System.out.println();
		for(int cnt = 1; cnt <=6 ;cnt++) {
			System.out.println(cnt + " : " + result[cnt]);
		}
	}
}
