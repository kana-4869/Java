package Demo02;

public class MailToAyumi2 {
	
  public static void main(String[] args) {
	  
		//����phone�ഴ��һ����Ϊphone�Ķ���
		//������ ������= new ������ ();
		Phone ayu2= new Phone ();
		
		ayu2.brand="huawei";
		ayu2.color="ɧ��";
		ayu2.price=2000000.0;
		
		System.out.println("ayu���ֻ�:"+ayu2.brand);
		System.out.println("��ɫ:"+ayu2.color);
		System.out.println("�۸�:"+ayu2.price);
		
		//��Ա��������
		
		
		ayu2.call("�����鲽��绰");
		ayu2.sendMessage();
		
	}

}



