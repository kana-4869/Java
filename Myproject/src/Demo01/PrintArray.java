package Demo01;

/*
 * ������̣�����Ҫʵ��һ�����ܵ�ʱ��ÿһ������Ĳ��趼Ҫ������Ϊ��
 * ��ϸ����ÿһ��ϸ�ڣ�
 * ������󣺵���Ҫʵ��һ�����ܵ�ʱ�򣬲����ľ���Ĳ��裬������һ��
 * �Ѿ����иù��ܵ��ˣ����������¶���
 */

import java.util.Arrays;

public class PrintArray {
	
	public static void main(String[] args) {
		
		int[] array= {10,20,30,40,50,60};
		//Ҫ���ӡ��ʽΪ��[10,20,30,40,50,60]
		//ʹ��������̣�ÿһ������ϸ�ڶ�Ҫ������Ϊ��
		
		System.out.print("[");
		
		for(int i=0;i<array.length;i++) {
			
			if(i==array.length-1) {
				System.out.println(array[i]+"]");
			}else { //����������һ��Ԫ��
				System.out.print(array[i]+", ");
			}
			
		}
		System.out.println("============================");
		//ʹ��һ���������
		//��һ��jdk�������ṩ�õ�arrays�࣬
		//������һ��toString������ֱ�Ӿ��ܰ���������Ҫ�ĸ�ʽ���ַ�����
		System.out.println(Arrays.toString(array));
				
		
	}

	
	}
	
	


