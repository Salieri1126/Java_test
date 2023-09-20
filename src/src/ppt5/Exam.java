package src.ppt5;

import java.util.Scanner;
import java.util.Vector;

public class Exam {
	
	private Vector<Integer> stuNum;
	
	public Exam() {
		stuNum = new Vector<>();
	}
	
	public Vector<Integer> getVector(){
		return stuNum;
	}
	
	public Integer getStuNum(int idx) {
		return stuNum.get(idx);
	}
	
	public void setStuNum(int num) {
		stuNum.add(num);
	}
	
	public Vector<Integer> compare (Vector<Integer> vec){
		Vector<Integer> newVec = new Vector<>();
		
		for(int i = 0 ; i < vec.size() ; i++) {
			if(stuNum.contains(vec.get(i))) {
				newVec.add(vec.get(i));
			}
		}
		return newVec;
	}
	
}
