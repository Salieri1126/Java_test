package src.ppt5;

import java.util.Vector;

public class Exam {
	
	private Vector<Integer> stuNum;
	
	//	시험마다 새로운 공간 할당
	public Exam() {
		stuNum = new Vector<>();
	}
	
	//	Vector 전체 출력
	public Vector<Integer> getVector(){
		return stuNum;
	}
	
	//	학생 번호 입력 (벡터에 추가)
	public void setStuNum(int num) {
		stuNum.add(num);
	}
	
	//	다른 벡터와 비교하여 공통된 학생 번호 찾아서 벡터로 출력
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
