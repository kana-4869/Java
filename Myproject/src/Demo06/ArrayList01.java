package Demo06;

import java.util.ArrayList;

/*
 * ����ĳ��Ȳ����Է����ı䡣
 * ���Ƕ���arraylist��˵����һ��������<E>�������ͣ�
 * ���ͣ�Ҳ����װ�ڼ��ϵ��е�Ԫ�أ�ȫ����ͳһ�����͡�
 * ע�⣺����ֻ�����������ͣ������ǻ������͡�
 * 
 *  ע�����
 *  ����arraylist��˵��ֱ�Ӵ�ӡ���õ��Ĳ��ǵ�ֵַ���������ݣ�
 *  ��������ǿգ��õ�����[]
 */


/**
 * @author kana
 *
 */
public class ArrayList01{
	
	public static void main(String[] args) {
		
		//������һ��arraylist�ļ��ϣ����ϵ�������list��
		//����ȫ��װ����string�ַ������͵�����
		//��ע����jdk 1.7��ʼ���Ҳ��<>������Բ�д���ݣ���<>��������Ҫд��
		
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list);
		
		//�򼯺ϵ�������һЩ���ݣ���Ҫ�õ�add������
		list.add("��餢���");
		list.add("�}ľ����");
		list.add("��Ұ����");
		System.out.println(list);
		
		
	}

}