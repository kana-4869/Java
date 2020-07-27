/*
 * 永远停不下来的循环，叫做死循环。
 * 
 * 死循环的标准格式：
 * while(true){
 * 循环体
 * }
 * 
 */
public class Demo16Deadloop {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("hello"+i);
			
		}
		while(true) {
			System.out.println("i love java!");
		}
		//system.out.println("hello")死循环的后面加上输出语句，会出现报错
		
		
	}

}
