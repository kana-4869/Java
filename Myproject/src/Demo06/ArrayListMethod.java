package Demo06;

import java.util.ArrayList;


/*
 * ArrayList���õķ�����:
 
 * public boolean add(E e):�򼯺������Ԫ�أ�����������Ҫ�ͼ�����һ�¡�
 * ��ע:����ArrayList������˵��add��Ӷ���һ���ǳɹ��ģ����Է���ֵ���ÿɲ��á�
 * ��������������(���ѧϰ)��˵��add��Ӷ�����һ���ɹ���������ӷ���ֵ�����Ƿ�ɹ���
 * 
 * public E get(int index):�Ӽ����л�ȡԪ�أ�������������ţ�����ֵ���Ƕ�Ӧλ��
 * ��Ԫ�ء�
 * 
 * public E remove(int index):�Ӽ��ϵ���ɾ��Ԫ�أ� ������������ţ�����ֵ����
 * ��ɾ����Ԫ�ء�
 * 
 * public int size():��ȡ���ϵĳߴ糤�ȣ�����ֵ�Ǽ����а�����Ԫ�ظ�����
 */
/**
 * @author kana
 *
 * 2020��9��13��
 */
public class ArrayListMethod {
	public static void main(String[] args) {
		
		ArrayList<String> list=	new ArrayList<>();
		System.out.println(list);
		
		//�򼯺������Ԫ��
		boolean success= list.add("YOSHIKI");
		System.out.println(list);
		System.out.println("��ӵĶ����Ƿ�ɹ�: "+success);//true;
		
		list.add("gack");
		list.add("ayumi");
		list.add("masa");
		System.out.println(list);
		
		//�Ӽ����л�ȡԪ�أ�get.����ֵ��0��ʼ��
		String name=list.get(2);
		System.out.println("��ȡ��2��Ԫ���ǣ�"+name);
		
		//�Ӽ�����ɾ��Ԫ�أ�remove������ֵ��0��ʼ��
		String whoremoved=list.remove(3);
	    System.out.println("��ɾ����3��Ԫ���ǣ�"+whoremoved);
	    System.out.println(list);
	    
	    //��ȡ���ϵĳߴ糤��
	    int size=list.size();
	    System.out.println("���ϵĳ����ǣ�"+size);
	}

	
}
