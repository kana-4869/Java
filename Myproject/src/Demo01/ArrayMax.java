package Demo01;


//������Ԫ���е����ֵ
 
public class ArrayMax {
	public static void main(String[] args) {
	
		int[] arrayA= {0,15,20,10,100,99,76,1000};
		int max=arrayA[0];
		
		
		for(int i=1; i<arrayA.length;i++) {
			/*��Ϊ��������ֵ����Ҫ������arrayA[0]Ҳ����10��ֵ��ֵ
			 * ��max���Դ����ƣ�����max<arrayA[i]
			 */
			
			if(max<arrayA[i]) {
				max=arrayA[i];
				
			}
			
		}
		System.out.println("���ֵ��: "+max);
		
		System.out.println("======================================= ");
		
		//������Ԫ���е���Сֵ
		
		int min=arrayA[0];
		
		for(int i=1;i<arrayA.length;i++) {
			if(min>arrayA[i]) {
				min=arrayA[i];
				/*��Ϊ�������Сֵ����Ҫ��С��arrayA[0]Ҳ����0��ֵ��ֵ
				 * ��min���Դ����ƣ�����min>arrayA[i]
				 */
			}
		}
		System.out.println("��Сֵ�ǣ�"+min);
	}

}
