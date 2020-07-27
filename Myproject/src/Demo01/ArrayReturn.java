/*
 * 一个方法可以有0，1多个参数，但是只能有0或者1一个返回值，不能有多个返回值。
 * 如果希望一个方法当中产生了多个结果数据进行返回，怎么办？
 * 解决方案，使用一个数组作为返回值类型即可。
 */

package Demo01;

public class ArrayReturn {
	public static void main(String[] args) {
		
		int[] array= calculate(1,2,3);
		
		System.out.println("打印调用的结果是："+array[0]);
	    System.out.println("打印调用的结果是："+array[1]);

	}
	
	
	public static int[] calculate(int a,int b,int c) {
		
		int sum=a+b+c;//求和
		int avg=sum/3;//平均值
		
		//以下为静态数组
		/*int[] result= {sum,avg};
		return result;
		*/  
		
		//以下为动态数组
		int[] result= new int[2];
		result[0]=sum;
		result[1]=avg;
		System.out.println("打印调用的结果是："+result);
		//打印的是数组，因此结果是地址值
		
		return result;
		
	}	
		
}

	
	

