package Demo07;



/*
 * ==是进行地址值的比较，如果确实需要字符串的内容比较，有两个方法：
 * 
 * public boolean equals(Objects obj):参数可以是任何对象，只有参数是一个字符串，
 * 并且内容相同的情况下才会给true，否则返回false。
 * 
 * 注意事项：
 * 1.任何对象都能用object进行接收。
 * 2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
 * 3.如果比较双方一个常量，一个变量，推荐把字符串放在前面。
 * 推荐："abc".equals(str)  不推荐：str.equals("abc")
 * 
 * public boolean equalsIgnoreCase(String str):忽略大小写，进行内容比较。
 * 
 */

/**
 * @author kana
 *
 * 2020年10月10日
 */
public class StringEquals {
	
	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="Hello";
		
		char[] charArray= {'H','e','l','l','o'};
		
		String str3= new String(charArray);
		
		System.out.println(str1.equals(str3));// true; 只要字符串的内容相同，结果就是true。
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("Hello"));//true。
		
		String str4="hello";
		System.out.println(str4.equals(str1));
		
		//false，因为内容不同，首字母大小写不同。
		
		String str5="abc";
		System.out.println("abc".equals(str1));//false
		//推荐写法：字符串写在前面，变量写在后面
		
		System.out.println(str1.equals("abc"));//false
		
		//String str5=null;
		//System.out.println(str5.equals("abc"));
		//不推荐，会出现空指针异常的报错：NullPointerException，就是空值.方法是不对的写法。
		
		System.out.println("===========================");
		
		String str6="java";
		String str7="Java";
		System.out.println(str6.equals(str7));//false，大小写不同
		System.out.println(str6.equalsIgnoreCase(str7));//true,该方法忽略大小写。
		
		System.out.println("abc一123".equalsIgnoreCase("abc壹123"));
		//flase，忽略大小写仅限英文，除此之外不会忽略。
		
		
		
	
	}
}
