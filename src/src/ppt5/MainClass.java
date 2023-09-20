package src.ppt5;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		HashMap<Character, Integer> item = new HashMap<>();
		
		System.out.println("문자열을 입력하세요.");
		String exit = null;
		
			try(Scanner scan = new Scanner(System.in)) {
				exit = scan.nextLine();
				for(int i = 0 ; i < exit.length() ; i++) {
					item.put(exit.charAt(i), (Integer)10);
				}
			
				
			}
			catch (Exception e) {
					System.out.println(e);
			}
		
		item.forEach((key,value)->System.out.println(key + " : " + value));
	}
}
