package Demo06;

import java.util.ArrayList;

/*��Ŀ��
 * �Զ���4��ѧ���������ӵ����ϣ���������
 * 
 * ˼·��
 * 1.�Զ���studentѧ���࣬�ĸ����֣�
 * ���еĳ�Ա��������private
 * �вκ��޲ι���
 * ȫ�ι���
 * Ҫдget��set��
 * 
 * 2.����һ�����ϣ������洢ѧ�����󡣷��ͣ�<Student>
 * 3.�����࣬�����ĸ�ѧ������
 * 4.��4��ѧ���������ӵ������У�add
 * 5.�������ϣ�for��size��get
 * 
 */

public class ArrayListStudent {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		Student one=new Student("ayu",33);
		Student two=new Student("mai",35);
		Student three=new Student("namie",30);
		Student four=new Student("kana",23);
		
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		
		//��������
		for(int i=0;i<list.size();i++) {
			Student stu=list.get(i);
			System.out.println("����: "+stu.getName()+" "+"����: "+stu.getAge());
		}
	}

}