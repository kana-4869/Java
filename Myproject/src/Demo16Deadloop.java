/*
 * ��Զͣ��������ѭ����������ѭ����
 * 
 * ��ѭ���ı�׼��ʽ��
 * while(true){
 * ѭ����
 * }
 * 
 */
public class Demo16Deadloop {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("hello"+i);
			
		}
		while(true) {
			System.out.println("i love java!");
		}
		//system.out.println("hello")��ѭ���ĺ�����������䣬����ֱ���
		
		
	}

}
