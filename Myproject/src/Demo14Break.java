/*
 * break�ؼ��ֵ��÷����������֣�
 * 1.��������switch��䵱�У�һ��ִ�У�����switch������̽�����
 * 2.����������ѭ����䵱�У�һ��ִ�У�����ѭ��������̽��������ѭ����
 * 
 * ����ѭ����ѡ����һ��С���飺
 * ���Ǵ���ȷ���ĳ�������forѭ�����������whileѭ����
 * 
 */
public class Demo14Break {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("hello"+i);
			//���ϣ���ӵ��Ĵο�ʼ������ȫ����Ҫ�ˣ���Ҫ���ѭ����
			if (i==4) { //�����ǰ�ǵ�4�Σ�
				break;//��ô�ʹ������ѭ����
			}
			
		}
	}

}