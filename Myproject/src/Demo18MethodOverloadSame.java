/*
 * ��ĿҪ��
 * �Ƚ����������Ƿ���ȡ�
 * �������ͷֱ�Ϊ����byte���ͣ�����int���ͣ�����long���͡�
 * ������main�����н��в��ԡ�
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
		System.out.println("����short�����ķ���ִ�У�");
		boolean same;
		if(a==b) {
			same=true;
			
		} else {
			same=false;
		}
		return same;
	}
	
	public static boolean IsSame(byte a, byte b) {
		System.out.println("����byte�����ķ���ִ�У�");
		boolean same=a==b? true:false;
		return same;
	}
	
	public static boolean IsSame(int a,int b) {
		System.out.println("����int�����ķ���ִ�У�");
		return a==b;
	}
	
	public static boolean IsSame(long a,long b) {
		System.out.println("����long�����ķ���ִ�У�");
		if (a==b) {
		return true;
		} else {
			return false;
		}
		
	}

}
