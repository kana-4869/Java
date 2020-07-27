/*
 * 题目要求：
 * 比较两个数据是否相等。
 * 参数类型分别为两个byte类型，两个int类型，两个long类型。
 * 并且再main方法中进行测试。
 * 
 */

public class Demo18MethodOverloadSame {
	
	public static void main(String[] args) {
		byte a=10;
		byte b=20;
		
		System.out.println(IsSame(a,b));
		
		System.out.println("==================");
		
		System.out.println(IsSame((short)20,(short)20));
		
		System.out.println("==================");
		
		System.out.println(IsSame(10,20));
		
		System.out.println("==================");
		
		System.out.println(IsSame(20L,20L));
		
		
	}
	
	public static boolean IsSame(short a, short b) {
		System.out.println("两个short参数的方法执行！");
		boolean same;
		if(a==b) {
			same=true;
			
		} else {
			same=false;
		}
		return same;
	}
	
	public static boolean IsSame(byte a, byte b) {
		System.out.println("两个byte参数的方法执行！");
		boolean same=a==b? true:false;
		return same;
	}
	
	public static boolean IsSame(int a,int b) {
		System.out.println("两个int参数的方法执行！");
		return a==b;
	}
	
	public static boolean IsSame(long a,long b) {
		System.out.println("两个long参数的方法执行！");
		if (a==b) {
		return true;
		} else {
			return false;
		}
		
	}

}
