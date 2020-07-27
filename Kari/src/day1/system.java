package day1;

public class system {
	
	public static void main(String[] args) {
	
		StringBuilder s = new StringBuilder("wwww~");
		s.append(111);
		
		System.out.println(s);
//		demo1();
		
		
	}
	public static void demo1(){
		long b = System.currentTimeMillis();
		for (int i = 0; i < 1; i++) {
			System.out.println(i);
		}
		
		long a = System.currentTimeMillis();
		
		long c = a-b;
		System.out.println("用的时间是" + c );
		
	}

}
