package Demo06;

/*
 * ���ϣ����arraylist���ϵ��д洢�����������ݣ�����ʹ�û������Ͷ�Ӧ�ġ���װ�ࡱ��
 * ��������        ��װ�ࣨ�������ͣ���װ�඼λ��java.lang���£�
 * byte        Byte
 * short       Short
 * int         Integer�����⡿
 * long        Long
 * float       Float
 * double      Double
 * char        Character�����⡿
 * boolean     Boolean
 * 
 * ��JDK1.5��ʼ��֧���Զ�װ�䣬�Զ����䡣
 * �Զ�װ�䣺��������-->��װ���ͣ��������ͣ�int-->Integer
 * �Զ����䣺��װ���ͣ��������ͣ�-->�������� Integer-->int
 */



import java.util.ArrayList;

/**
 * @author kana
 *
 * 2020��9��13��
 */
public class ArrayListBasic {

	public static void main(String[] args) {
		ArrayList<String> listA= new ArrayList<>();
		//����Ϊ����д�������ͣ�������������ݣ�ֻ�����������ͣ�string��
		//�����ǻ������ͣ�float��double��char��Boolean������
		//ArrayList<int> listB= new ArrayList<>();
		
		//����int���͵�����
		ArrayList<Integer> listC=new ArrayList<>();
		listC.add(100);
		listC.add(200);
		listC.add(300);
		System.out.println(listC);
		
		//������һ��int����Ԫ�شӼ�����ȡ��
	    int num=listC.get(1);
	    System.out.println("��һ��Ԫ���ǣ�"+num);
	    
	    //������һ��int����Ԫ��ɾ��
	    int num1=listC.remove(1);
	    System.out.println("��ɾ����1��Ԫ���ǣ�"+num1);
	    System.out.println(listC);
		
	}
}