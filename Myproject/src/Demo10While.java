/* whileѭ����һ����׼��ʽ������һ����չ��ʽ��
 * 
 * ��׼��ʽ��
 * while�������жϣ�{
 *     ѭ����
 *   }
 *   
 *   ��չ��ʽ��
 *   ��ʼ����䣻
 *   while�������жϣ�{
 *   ѭ���壻
 *  ������䣻
 *  }
 * 
 */
public class Demo10While {
	public static void main (String[] args) {
		for (int i=1; i<=10;i++) {
			System.out.println ("sorry,it's my falt!"+i);
		}
		
		
		
	System.out.println("===============================");
	
   int i=1; // 1.��ʼ����䣻
   while (i<=10) { // 2.�����жϣ�
	   System.out.println("�Բ����Ҵ��ˣ�"+i); // 3.ѭ����
	   i++; // 4.������䡣
	   

	  
	   }
  
   System.out.println("===============================");
   
   //���⣺���� Demo12 HundredSum�ı��ʽ��
   //1-100ż���ĺͣ���while����ӡ�����
   
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
