package collection.arraylist;

import java.util.ArrayList;

import collection.Member;

	public class MemberArrayList {
	private ArrayList<Member> arrayList; //ArrayList ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //Member������ ������ ArrayList ����
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}  //ArrayList�� ȸ���� �߰��ϴ� �޼���
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i<arrayList.size(); i++) { //get()�޼���� ȸ���� ���������� ������
			Member member = arrayList.get(i);	
			int tempId = member.getMemberId(); 	
			if(tempId == memberId) { //ȸ�� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i); //�ش�ȸ���� ����
				return true;
			}
		}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�");
		return false; //�ݺ����� ���������� �ش� ���̵� ã�� ���� ���
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	} //��ü ȸ���� ����ϴ� �޼��� 
	
}
