package Demo02;

public class MailToAyumi {
	
	public static void main(String[] args) {
		//����phone�ഴ��һ����Ϊphone�Ķ���
		//������ ������= new ������ ();
		Phone ayu= new Phone ();
		
		ayu.brand="iphone";
		ayu.color="��ĸ��";
		ayu.price=1000000.0;
		
		System.out.println("���鲽�ֻ�:"+ayu.brand);
		System.out.println("�ֻ���ɫ:"+ayu.color);
		System.out.println("�ֻ��۸�:"+ayu.price);
		
		//��Ա��������
		
		
		ayu.call("midori");
		ayu.sendMessage();
		ayu.pNumber(8000);
		
		
		
		
	}

}