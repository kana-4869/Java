/*
 * 数组可以作为方法的参数。
 * 当调用方法的时候，向方法的小括号进行传参，传进去的其实是数组的地址值
 */

package Demo01;

public class Arrayparam {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50};
		
		ArrayParam(array);//单独调用
     	System.out.println(array);//结果是地址值：[I@6d1e7682
		
	}
	
	public static void ArrayParam(int[] array) {
		
		System.out.println(" ArrayParam方法收到的参数是：");
		
		System.out.println(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}


		
		
		
		
				
	

	
	
