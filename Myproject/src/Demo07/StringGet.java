package Demo07;

/*String���г��õĻ�ȡ�������£�
 * public int Length():��ȡ�ַ������еĸ��������ַ����ĳ��ȣ�
 * public String concat(String str):��������ͬ���ַ���ƴ����һ�𣬷����µ��ַ�����
 * public charAt(int index):��ȡ�ַ����������ţ�����ֵ��0��ʼ��
 * public indexOf(String str):���Ҳ����ַ��������״γ��ֵ�����λ�ã����û�У�����-1ֵ��
 * 
 */

/**
 * @author kana
 *
 * 2020��10��17��
 */
public class StringGet {
	
	public static void main(String[] args) {
		//��ȡ�ַ����ĳ���
		int Length="DFGHJKLDFGHJKDFGHJKLDFGHJK".length();
		System.out.println("�ַ����ĸ����ǣ�"+Length);
		
		
		//ƴ���ַ���
		
		String str1="Hello";
		String str2="World";
		String str3= str1.concat(str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("===============================");
		
		//��ȡָ������λ�õĵ����ַ�
		char ch="ayumihamasaki".charAt(2);
		System.out.println("��2������λ�õ��ַ��ǣ�"+ch);
		
		//�����ַ����ڱ����ַ����еĵ�һ������λ��
		String str4="ayumihamasaki";
		int index = str4.indexOf("hama");
		System.out.println("��һ������λ���ǣ�"+index);
		
		//���û���ҵ���һ�ε�����λ�ã�����ֵΪ-1
		System.out.println("Hello".indexOf("ABC"));
		
		
	}





}