package collection;

public class Member {
	private int memberId; //ȸ�� ���̵� 
	private String memberName; //ȸ�� �̸�
	
	
	
	
	@Override
	public int hashCode() {
		return memberId; //hashCode() �޼��尡 ȸ�� ���̵� ��ȯ�ϵ��� ������
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) //�Ű������� ���� ȸ�� ���̵� �ڽ��� ȸ�� ���̵�� ���ٸ� true ��ȯ
				return true;
			else
				return false;
		}
		return false;
	}

	public Member(int memberId,String memberName) {
		this.memberId = memberId;
		this.memberName = memberName; 
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName() {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "ȸ������ ���̵�� "+ memberId+"�Դϴ�.";
	} // toString()�޼��� ������ 

}
