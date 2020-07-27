//直角三角形打印

package kanastudy;

public class RightTriangle {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) { //打印10行空格
			
			for(int y=1;y<i;y++) { 
				//第一次循环打印1个*，第二次循环打印2个*，以此类推
				System.out.print("*");
			}
			System.out.println(" ");
			//y的循环每执行完一次，再进行转行。
			
		}
		
		
	}

}
