/*
 * ����һ���࣬����ģ�⡰�ֻ�������
 * ���ԣ�Ʒ�ƣ���ɫ���۸�
 * ��Ϊ�����ţ���绰
 * 
 * ��Ӧ����
 * ��Ա���������ԣ�
 * string brand��Ʒ��
 * string color����ɫ
 * double price���۸�
 * 
 * ��Ա��������Ϊ��
 * 
 * public void call��string who��{}//��绰
 * public void sendMessage����{}//Ⱥ������
 */

package Demo02;

public class Phone {
	
	String brand;
	Double price;
	String color;
	
	public void call(String who) {
		System.out.println("�ҽ�"+who);
	}
	public void sendMessage() {
		System.out.println("�������ݣ�I will support you forever");
	}
	public void pNumber(int phoneNumber) {
		System.out.println(phoneNumber);
	}

	
}