/*
 * ��������������������װ���̳У���̬��
 * 
 */

package Demo03;

public class Demo02Method {
	
	public static void main(String[] args) {
		int[]array= {5,10,20,50,11};
		int[]arrayA= {88,99,10};
		
	    int max=getMethod(arrayA);
	    System.out.println("���ֵ�ǣ�"+max);
	
	
	}
	
	public static int getMethod(int[]array01) {
	
		int max=array01[0];
		
		for(int i=1;i<array01.length;i++) {
			if(array01[i]>max) {
				max=array01[i];
			}
		}
		return max;
			
	}
}
	
	
	