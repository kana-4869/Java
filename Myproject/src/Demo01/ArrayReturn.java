/*
 * һ������������0��1�������������ֻ����0����1һ������ֵ�������ж������ֵ��
 * ���ϣ��һ���������в����˶��������ݽ��з��أ���ô�죿
 * ���������ʹ��һ��������Ϊ����ֵ���ͼ��ɡ�
 */

package Demo01;

public class ArrayReturn {
	public static void main(String[] args) {
		
		int[] array= calculate(1,2,3);
		
		System.out.println("��ӡ���õĽ���ǣ�"+array[0]);
	    System.out.println("��ӡ���õĽ���ǣ�"+array[1]);

	}
	
	
	public static int[] calculate(int a,int b,int c) {
		
		int sum=a+b+c;//���
		int avg=sum/3;//ƽ��ֵ
		
		//����Ϊ��̬����
		/*int[] result= {sum,avg};
		return result;
		*/  
		
		//����Ϊ��̬����
		int[] result= new int[2];
		result[0]=sum;
		result[1]=avg;
		System.out.println("��ӡ���õĽ���ǣ�"+result);
		//��ӡ�������飬��˽���ǵ�ֵַ
		
		return result;
		
	}	
		
}

	
	

