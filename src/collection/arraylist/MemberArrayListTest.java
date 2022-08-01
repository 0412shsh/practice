package collection.arraylist;

import collection.Member;
public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList(); //MemberArrayList ��ü���� 
		
		Member memberLee = new Member(1001, "�̷���");
		Member memberSon = new Member(1002, "�ջ��");
		Member memberPark = new Member(1003, "�ں���");
		Member memberHong = new Member(1004, "ȫ ��"); //Member���� ���ο� ȸ�� �ν��Ͻ� ����
		Member memberGo = new Member(1005, "����"); //�����л� �߰�
		
		memberArrayList.addMember(memberLee); //0
		memberArrayList.addMember(memberSon); //1
		memberArrayList.addMember(memberPark); //2
		memberArrayList.addMember(memberHong); //ArrayList�� ȸ�� �߰� ,3 
		
		memberArrayList.insertMember(memberGo, 1); //���� ��ġ�� 
		
		memberArrayList.showAllMember(); //��ü ȸ�� ���
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
		
//		memberArrayList.removeMember(memberHong.getMemberId());
//		memberArrayList.showAllMember();
		
		
	
	}

}
