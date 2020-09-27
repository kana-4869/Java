package Demo06;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��Ŀ��
 * ��һ���󼯺ϴ���20��������֣�Ȼ��ɸѡ���е�ż��Ԫ�أ��ŵ�С�����У�
 * Ҫ��ʹ���Զ���ķ�����ʵ��ɸѡ��
 * 
 * ������
 * 1.��Ҫ����һ���󼯺ϣ������洢int���֣�<integer>;
 * 2.���������Random nextInt
 * 3.ѭ��20�Σ���������ַ���󼯺ϣ�forѭ����add������
 * 4.����һ����������������ɸѡ��
 * 
 * ɸѡ�����ݴ󼯺ϣ�ɸѡ����������Ԫ�أ��õ�С���ϣ�
 * ��Ҫ�أ�
 * ����ֵ���ͣ�ArrayListС����(����Ԫ�ظ�����ȷ��)
 * �������ƣ�getSmallList
 * �����б���ArrayList�󼯺ϣ�װ��20��������֣�
 * 
 * 5.�жϣ�if����ż����num%2==0��
 * 6.�����ż�����ͷŵ�С���ϵ��У����򲻷š�
 */

public class ArrayListReturn {
	
	public static void main(String[] args) {
		ArrayList<Integer> biglist = new ArrayList<>();
		Random r=new Random();
		
		for(int i=0;i<20;i++) {
			int num=r.nextInt(100)+1;// 1-100;
			biglist.add(num);
		}
		
		ArrayList<Integer> smalllist= getSmallList(biglist);
		
		System.out.println("ż���ܹ��ж��ٸ��� "+smalllist.size());
		for(int i=0;i<smalllist.size();i++) {
			System.out.println(smalllist.get(i));
		}
	}
	
	//������������մ󼯺ϲ���������С���Ͻ��
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> biglist){
    	//����һ��С���ϣ�����װż�����
    	ArrayList<Integer> smalllist = new ArrayList<>();
    	for(int i=0;i<biglist.size();i++) {
    		int num=biglist.get(i);
    		
    		if(num%2==0) {
    			smalllist.add(num);
    		} 
    	}		
    	return smalllist;

		
    	
    }
}