package Demo01;
//要求不能使用新数组，就用原来的唯一一个数组。

/*数组元素反转，其实就是对称位置的元素交换；
 * 对称位置需要两个索引:
 * int min=0,
 * int max=arrayA.length-1;
 * 
 * 如何交换两个变量的值？
 * int a=10;
 * int b=10;
 * 用第三个变量倒手
 * int temp=a;
 * a=b;
 * b=temp;
 * 
 * 什么时候停止交换？
 * 1.min==max
 * 2.min>max
 * 什么时候应该交换？
 * min<max
 */

import java.lang.reflect.Array;

public class ArrayReverce {
	
	public static void main(String[] args) {
		int[] arrayA= {10,20,35,45,50};
		//遍历打印数组本来的样子
		for(int i=0;i<arrayA.length;i++){
			
			System.out.println(arrayA[i]);
		}
		
		System.out.println("=============================");
		
		/*
		 * 初始化语句:int min=0,max=arrayA.length-1;
		 * 条件判断:min<max
		 * 步进表达式:min++,max--
		 * 循环体:用第三个变量倒手
		 */
		
		for(int min=0,max=arrayA.length-1;min<max;min++,max--) {
			
			int temp=arrayA[min];
			arrayA[min]=arrayA[max];
			arrayA[max]=temp;
		}
		
		//再次打印输出遍历数组后来的样子
		
		for(int i=0;i<arrayA.length;i++) {
			System.out.println(arrayA[i]);
		}
	}
		
}




