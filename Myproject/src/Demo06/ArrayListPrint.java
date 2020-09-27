package Demo06;

import java.util.ArrayList;

/*
 * ��Ŀ��
 * ������ָ����ʽ��ӡ���ϵķ�����Arraylist������Ϊ��������
 * ʹ��{}���𼯺ϣ�ʹ��@�ָ�ÿ��Ԫ�ء���ʽ����{Ԫ��@Ԫ��@Ԫ��}
 * system.put.println(list); [10,20,30]
 * printArrayList(list); {10@20@30}
 */

public class ArrayListPrint {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("���Ӥޤ���");
		list.add("�ɤ館���");
		list.add("����`�ޥ󥭥�");
		
		System.out.println(list);
		
		printArrayList(list);
		
		/*���巽������Ҫ�أ�
		 * ����ֵ���ͣ�ֻ�Ǵ�ӡ���ѣ�û�����㣬û�н����so����void��
		 * �������ƣ�printArrayList��
		 * �����б���ArrayList
		 */
	}
	
	public static void printArrayList(ArrayList<String> list) {
		// {10@20@30}
		
		System.out.print("{");
		
		for(int i=0;i<list.size();i++) {
			String name=list.get(i);
			
			if(i==list.size()-1) {
				System.out.println(name+"}");
			}
			else {
			System.out.print(name+"@");
			}
		}
	}
}