package day1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Equals {
	public static void main(String[] args) {
		Persion p1= new Persion("a1",18);
		Persion p2= new Persion("aa",18);
		boolean b = p1.equals(p2);
		

		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(b);
		demo01();
	}

	private static void demo01() {
		
		SimpleDateFormat smp = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		Date date = new Date();
		String str = smp.format(date);
		
		System.out.println(date);
		System.out.println(str);
		

	}
}
