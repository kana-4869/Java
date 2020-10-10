package Demo07;

/*
 * 字符串常量池：程序当中直接写的string型字符串就在常量池当中。
 * 
 * 对于基本数据类型来说，==是进行数值的比较；
 * 对于引用数据类型来说，==是进行【地址值】的比较。
 * 
 * 
 * 
 */


/**
 * @author kana
 *
 * 2020年10月10日
 */
public class StringPool {
	
	public static void main(String[] args) {
		
		String str1="abc";
		String str2="abc";
		
		char[] charArray= {'a','b','c'};
		
		String str3 = new String(charArray);
		
		//以下为字符串的比较，得出的是Boolean值。
		System.out.println(str1==str2);  
		System.out.println(str1==str3);
		System.out.println(str2==str3);
	}

}
