/*
 * ���������Ϊ�����Ĳ�����
 * �����÷�����ʱ���򷽷���С���Ž��д��Σ�����ȥ����ʵ������ĵ�ֵַ
 */

package Demo01;

public class Arrayparam {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50};
		
		ArrayParam(array);//��������
     	System.out.println(array);//����ǵ�ֵַ��[I@6d1e7682
		
	}
	
	public static void ArrayParam(int[] array) {
		
		System.out.println(" ArrayParam�����յ��Ĳ����ǣ�");
		
		System.out.println(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}


		
		
		
		
				
	

	
	
