package collection.arraylist;

import collection.Member;
public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList(); //MemberArrayList 객체생성 
		
		Member memberLee = new Member(1001, "이레몬");
		Member memberSon = new Member(1002, "손사과");
		Member memberPark = new Member(1003, "박복숭");
		Member memberHong = new Member(1004, "홍 시"); //Member형의 새로운 회원 인스턴스 생성
		Member memberGo = new Member(1005, "고감자"); //감자학생 추가
		
		memberArrayList.addMember(memberLee); //0
		memberArrayList.addMember(memberSon); //1
		memberArrayList.addMember(memberPark); //2
		memberArrayList.addMember(memberHong); //ArrayList에 회원 추가 ,3 
		
		memberArrayList.insertMember(memberGo, 1); //고감자 새치기 
		
		memberArrayList.showAllMember(); //전체 회원 출력
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
		
//		memberArrayList.removeMember(memberHong.getMemberId());
//		memberArrayList.showAllMember();
		
		
	
	}

}
