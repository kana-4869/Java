package Demo07;

/*
 * �ַ��������أ�������ֱ��д��string���ַ������ڳ����ص��С�
 * 
 * ���ڻ�������������˵��==�ǽ�����ֵ�ıȽϣ�
 * ������������������˵��==�ǽ��С���ֵַ���ıȽϡ�
 * 
 * 
 * 
 */


/**
 * @author kana
 *
 * 2020��10��10��
 */
public class StringPool {
	
	public static void main(String[] args) {
		
		String str1="abc";
		String str2="abc";
		
		char[] charArray= {'a','b','c'};
		
		String str3 = new String(charArray);
		
		//����Ϊ�ַ����ıȽϣ��ó�����Booleanֵ��
		System.out.println(str1==str2);  
		System.out.println(str1==str3);
		System.out.println(str2==str3);
	}

}
