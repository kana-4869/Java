/*���δ�ӡ
 * print()�������䲻�ỻ�У�
 * println()ln��line����д�����ָ�ʽ���������ת�С�
 * 
 * ��ϰһ�´�ǰѧϰ�ķ�����������֪ʶ��
 * �����ʽ��
 * public static void main ��������() {
 * ������
 * }
 * 
 * ���ø�ʽ��
 * ��������();
 * 
 * ע�����
 * 1.����������Ⱥ�˳������ν��
 * 2.������������ǰ��ŵģ�������һ���������ڲ���������һ��������
 * 3.����������Լ�����ִ�У����ϣ��ִ�У�һ��Ҫ���з����ĵ��á�
 * 
 */

package kanastudy;

public class Rectangle {
	public static void main(String[] args) {
		printMethod();
		
			
		}
	
		
		public static void printMethod(){
			for(int j=0;j<5;j++) {
				for(int i=0;i<20;i++) {
					System.out.print("*");//���Ϊÿ20��*����ѭ��5�Ρ�
				}
				System.out.println(" ");//������ѭ����������⣬����ת�еĴ�ӡ�������
				//ÿ20��*��ӡ��ת��һ�Ρ�
			}
			
		}
	}
		
	
		