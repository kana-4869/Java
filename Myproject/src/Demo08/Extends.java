package Demo08;

/*�ڼ̳еĹ�ϵ�У����������һ�����ࡱ��Ҳ����˵��������Ե������࿴����
 * ���磬������Ա���������ǽ�ʦ����ô����ʦ����Ա��������ϵ:is a.
 * 
 * ���常��ĸ�ʽ:һ����ͨ���ඨ��
 * public class ��������{
 *          //...
 * }
 * 
 * ��������ĸ�ʽ:
 * public class ��������{
 *         //...
 *         
 *   �̳У���Ҫ���𵽴��븴�õ�Ч����      
 * }
 */

public class Extends {

	public static void main(String[] args) {
		//����һ���������
		Teacher teacher= new Teacher();
		
		//teacher�൱����Ȼʲô��ûд�����ǻ�̳и���Ա����method����
	    Teacher.method();
	    
	    //������һ���������:����
	    Assistant assistant= new Assistant();
	    Assistant.method();
	    
	}
}
