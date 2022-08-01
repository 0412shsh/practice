package collection.arraylist;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList; //  ArrayList ���� 


public MemberArrayList() {
	arrayList = new ArrayList<Member>(); //Member������ ������ ArrayList ���� 
	}

public void addMember(Member member) {
	arrayList.add(member); //ArrayList�� ȸ���� �߰��ϴ� �޼���
}

public void insertMember(Member member, int index) {
	arrayList.add(index, member);  //���ϴ� ��ġ�� ȸ�� ����
	
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
	System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
	return false; 
	
}

	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}