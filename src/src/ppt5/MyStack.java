package src.ppt5;

import java.util.ArrayList;

public class MyStack<T> {
	private ArrayList<T> element;
	private int idx;
	public MyStack() {
		this.element = new ArrayList<T>();
		this.idx = -1;
	}
	
	public void push(T element) {
		this.element.add(++idx, element);
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("제거할 요소가 없습니다.");
			return;
		}
		this.element.remove(idx--);
	}
	
	public T peek() {
		return element.get(idx);
	}
	
	public boolean isEmpty() {
		if(idx == -1) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return idx+1;
	}
}
