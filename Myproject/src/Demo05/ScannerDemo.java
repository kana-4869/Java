/*
 *
 * Scanner��Ĺ��ܣ�����ʵ�ּ����������ݣ��������С�
 * 
 * ��������һ���ʹ�ò��裺
 * 
 * 1.����
 * import��·��.�����ƣ�
 * �����Ҫʹ�õ�Ŀ���࣬�͵�ǰ��λ��ͬһ�����£����ʡ�Ե�����䲻д��
 * ֻ��java.lang���µ����ݲ���Ҫ�����������İ�����Ҫд��import��䡣
 * 
 * 2.����
 * ������ ������=new ������();
 * 
 * 3.ʹ��
 * ������.��Ա������
 * 
 * ��ȡ���������int���֣�int num=sc.nextInt();
 * ��ȡ����������ַ�����String str=sc.next();
 */


package Demo05;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println("input number is: "+num);
		
		String str=sc.next();
		System.out.println("input string number is: "+str);
	}



	
	

}