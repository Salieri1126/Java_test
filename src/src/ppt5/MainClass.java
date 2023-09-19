package src.ppt5;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayList<? super Object> intArr = new ArrayList();
		
		intArr.add(10);
		intArr.add(20);
		intArr.add(30);
		intArr.add(40);
		intArr.add(50);
		
		
		System.out.println(intArr);
		swap(intArr, 2, 3);
		
		System.out.println(intArr);
	}
	
	static void swap(ArrayList<? super Object> Arr, int idx1, int idx2) {
		Object temp;
		temp = Arr.get(idx1);
		Arr.add(idx1,Arr.get(idx2));
		Arr.remove(idx1+1);
		Arr.add(idx2,temp);
		Arr.remove(idx2+1);
	}
}