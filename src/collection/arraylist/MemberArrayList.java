package collection.arraylist;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList; //  ArrayList 선언 


public MemberArrayList() {
	arrayList = new ArrayList<Member>(); //Member형으로 선언한 ArrayList 생성 
	}

public void addMember(Member member) {
	arrayList.add(member); //ArrayList에 회원을 추가하는 메서드
}

public void insertMember(Member member, int index) {
	arrayList.add(index, member);  //원하는 위치에 회원 삽입
	
}


public boolean removeMember(int memberId) {
	for(int i = 0; i<arrayList.size(); i++) {
		Member member = arrayList.get(i); 
		int tempId = member.getMemberId();
		if(tempId == memberId){
			arrayList.remove(i); 
			return true; 
		}
	}
	System.out.println(memberId+"가 존재하지 않습니다.");
	return false; 
	
}

	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}