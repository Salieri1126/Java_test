package src.ppt5;

import java.util.HashSet;

public class MySet {
	
	HashSet<Integer> scoreSet = new HashSet<>();
	
	public void add(Integer score) {
		scoreSet.add(10);
		scoreSet.add(20);
		scoreSet.add(10);
	}
	
	public void size() {
		System.out.println(scoreSet.size());		
	}

	public void elem() {
		scoreSet.forEach(score->System.out.print(score + " "));
	}
	
	public void hashcode() {
		System.out.println(scoreSet.hashCode());
	}
	
	{
	if(scoreSet.contains(30)) {
		System.out.println("30점 있음");
	} else {
		System.out.println("30점 없음");
	}
	}
}
