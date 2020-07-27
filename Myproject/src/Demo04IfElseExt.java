//x和y的关系满足如下：
//如果x >=3,那么y=2x+1；
//如果-1<X<3，那么y=2x；
//如果x <= -1,那么y=2x-1；

//else if的条件可以无限追加。



public class Demo04IfElseExt {
	public static void main(String[] args) {
		int x=-10;
		int y;
		
		if (x >=3) {
			y=2*x+1; //程序中没有2x这种写法，如果要表达数学中的2x，要清楚的写出2*x。
		} else if (-1<x && x<3) {
			y=2*x;//(-1<X<3) 错误写法，如果表达式有连续区间，一定要将其拆开
		
			
		} else {
			y=2*x-1;
			
		}
		System.out.println("结果是："+y);
	}

}
