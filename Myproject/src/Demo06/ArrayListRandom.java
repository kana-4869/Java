package Demo06;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��Ŀ��
 * ����6��1-33֮���������������ӵ����ϣ����������ϡ�
 * 
 * ˼·��
 * 1.��Ҫ�洢6�����֣�����һ�����ϣ�<integer>
 * 2.�������������Ҫ�õ�random
 * 3.ѭ��6�Σ�������6��������֣�forѭ��
 * 4.ѭ���ڵ���r.nextInt��int n����������33��0-32������+1����1-33
 * 5.���������ӵ������У�add
 * 6.�������ϣ�for��size��get
 *
 */

public class ArrayListRandom {
	
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<6;i++) {
			int num=r.nextInt(33)+1;
			list.add(num);
			
		}
		
		//��������
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
	}
		
	}

}