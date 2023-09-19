package src.ppt4;

import java.time.LocalDate;

public class MainClass {

	public static void main(String[] args) {

		String strJava = "Hello, Java, Hello";
		
		System.out.println(".length() : " + strJava.length());
		
		String strJava2 = strJava.replaceFirst("Hello", "hi");
		System.out.println(strJava2);
		
		System.out.println(strJava);
		System.out.println("contains() : "+ strJava.contains("Java"));
		
		System.out.println("indexOf() : "+ strJava.indexOf("Java"));
		
		System.out.println("substring() : " + strJava.substring(strJava.indexOf("Java"), "Java".length()+strJava.indexOf("Java")));
		
		String strSplit[] = strJava.split(",");
		for(String str : strSplit) {
			System.out.println(str.trim());
		}
	}
}
