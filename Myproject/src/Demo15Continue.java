/*
 * ��һ��ѭ�����������continue�ؼ��֡�
 * һ��ִ�У�����������ǰ��ѭ��ʣ�����ݣ����Ͽ�ʼ��һ��ѭ����
 * 
 * ע�⣺break��continue������
 * ��һ��ѭ��������д��break�󣬺����ѭ��������ִ�У�
 * ��һ��ѭ��������д��continue�󣬵�ǰ��ѭ������������ѭ��������ִ�С�
 */
public class Demo15Continue {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==4) { //�����ǰ�ǵ�4�㡣
				continue;//��ô������ǰ��ѭ�������Ͽ�ʼ��һ�Σ�����㣩
			}
			System.out.println(i+"�㵽�ˡ�");
		}
		
	}

}
