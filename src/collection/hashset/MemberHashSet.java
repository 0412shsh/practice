package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; //hashSet 선언
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	} //HashSet 생성
	
	public void addMember(Member member) {
		hashSet.add(member);
	} //HashSet에 회원 추가
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next(); //회원을 하나씩 가져와서
			int temId = member.getMemberId();
			if(temId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"가 존재 하지 않습니다");
		return false;
	}	
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	} //모든 회원 출력 
	
	
}
