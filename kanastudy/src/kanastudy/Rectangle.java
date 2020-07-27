/*矩形打印
 * print()输出的语句不会换行；
 * println()ln是line的缩写，这种格式的输出语句会转行。
 * 
 * 复习一下此前学习的方法基础入门知识。
 * 定义格式：
 * public static void main 方法名称() {
 * 方法体
 * }
 * 
 * 调用格式：
 * 方法名称();
 * 
 * 注意事项：
 * 1.方法定义的先后顺序无所谓。
 * 2.方法定义必须是挨着的，不能在一个方法的内部定义另外一个方法。
 * 3.方法定义后，自己不会执行，如果希望执行，一定要进行方法的调用。
 * 
 */

package kanastudy;

public class Rectangle {
	public static void main(String[] args) {
		printMethod();
		
			
		}
	
		
		public static void printMethod(){
			for(int j=0;j<5;j++) {
				for(int i=0;i<20;i++) {
					System.out.print("*");//结果为每20个*横向循环5次。
				}
				System.out.println(" ");//在以上循环体的括号外，加上转行的打印输出语句后，
				//每20个*打印后转行一次。
			}
			
		}
	}
		
	
		