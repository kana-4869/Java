package Demo07;



/*
 * ==�ǽ��е�ֵַ�ıȽϣ����ȷʵ��Ҫ�ַ��������ݱȽϣ�������������
 * 
 * public boolean equals(Objects obj):�����������κζ���ֻ�в�����һ���ַ�����
 * ����������ͬ������²Ż��true�����򷵻�false��
 * 
 * ע�����
 * 1.�κζ�������object���н��ա�
 * 2.equals�������жԳ��ԣ�Ҳ����a.equals(b)��b.equals(a)Ч��һ����
 * 3.����Ƚ�˫��һ��������һ���������Ƽ����ַ�������ǰ�档
 * �Ƽ���"abc".equals(str)  ���Ƽ���str.equals("abc")
 * 
 * public boolean equalsIgnoreCase(String str):���Դ�Сд���������ݱȽϡ�
 * 
 */

/**
 * @author kana
 *
 * 2020��10��10��
 */
public class StringEquals {
	
	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="Hello";
		
		char[] charArray= {'H','e','l','l','o'};
		
		String str3= new String(charArray);
		
		System.out.println(str1.equals(str3));// true; ֻҪ�ַ�����������ͬ���������true��
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("Hello"));//true��
		
		String str4="hello";
		System.out.println(str4.equals(str1));
		
		//false����Ϊ���ݲ�ͬ������ĸ��Сд��ͬ��
		
		String str5="abc";
		System.out.println("abc".equals(str1));//false
		//�Ƽ�д�����ַ���д��ǰ�棬����д�ں���
		
		System.out.println(str1.equals("abc"));//false
		
		//String str5=null;
		//System.out.println(str5.equals("abc"));
		//���Ƽ�������ֿ�ָ���쳣�ı�����NullPointerException�����ǿ�ֵ.�����ǲ��Ե�д����
		
		System.out.println("===========================");
		
		String str6="java";
		String str7="Java";
		System.out.println(str6.equals(str7));//false����Сд��ͬ
		System.out.println(str6.equalsIgnoreCase(str7));//true,�÷������Դ�Сд��
		
		System.out.println("abcһ123".equalsIgnoreCase("abcҼ123"));
		//flase�����Դ�Сд����Ӣ�ģ�����֮�ⲻ����ԡ�
		
		
		
	
	}
}