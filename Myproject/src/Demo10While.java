/* while循环有一个标准格式，还有一个扩展格式。
 * 
 * 标准格式：
 * while（条件判断）{
 *     循环体
 *   }
 *   
 *   扩展格式：
 *   初始化语句；
 *   while（条件判断）{
 *   循环体；
 *  步进语句；
 *  }
 * 
 */
public class Demo10While {
	public static void main (String[] args) {
		for (int i=1; i<=10;i++) {
			System.out.println ("sorry,it's my falt!"+i);
		}
		
		
		
	System.out.println("===============================");
	
   int i=1; // 1.初始化语句；
   while (i<=10) { // 2.条件判断；
	   System.out.println("对不起，我错了！"+i); // 3.循环体
	   i++; // 4.步进语句。
	   

	  
	   }
  
   System.out.println("===============================");
   
   //课题：翻译 Demo12 HundredSum的表达式，
   //1-100偶数的和，以while语句打印输出。
   
   int a=1;
   int sum=0;
   
   while (a<=100) {
	   if(a%2==0) {
		   sum+=a;
		   
		   
	   } 
	   a++;
	   
   } System.out.println("the result is: "+sum);
   
		
	
	
		
	}

}
