package kanastudy;

public class IsosclesTriangle {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int y=10;y>=i;y--) {
				System.out.print(" "); 
				//等腰三角形可以分成三个部分，先打印空白的倒直角三角形
			
			}
			for(int y=1;y<=i;y++) {
				System.out.print("*");//再打印中间靠左方向的直角三角形
			}
			for(int y=1;y<i;y++) {
				System.out.print("*");
				//再打印靠右方向的直角三角形y<i，所以第一行没有*
			}
			
			
			
			System.out.println(" "); //每打印输出一次，进行转行。
			
			
		}
		
	}

}
