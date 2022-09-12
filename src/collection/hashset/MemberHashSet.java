package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; //hashSet ����
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	} //HashSet ����
	
	public void addMember(Member member) {
		hashSet.add(member);
	} //HashSet�� ȸ�� �߰�
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next(); //ȸ���� �ϳ��� �����ͼ�
			int temId = member.getMemberId();
			if(temId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"�� ���� ���� �ʽ��ϴ�");
		return false;
	}	
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	} //��� ȸ�� ��� 
	
	
}
