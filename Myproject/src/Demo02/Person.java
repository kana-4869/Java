/*
 * 1.������Ҳ����ָ����Ҫʹ�õ��࣬��ʲôλ�á�
 * import������.�����ƣ�
 * import Demo02.Person;
 * ���ں͵�ǰ����ͬһ����������£���������ʡ�Բ�д��
 * 
 * 2.��������ʽ��
 * ������ ������= new ������ ();
 * Student stu= new ������();
 * 
 * 3.ʹ�ã������������
 * ʹ�ó�Ա������������.��Ա������
 * ʹ�ó�Ա������������.��Ա��������������
 * Ҳ��������˭�����ö�����.˭
 * 
*/

package Demo02;

import Demo01.ArrayReturn;

public class Person {
	public static void main(String[] args) {
		//������ ������= new ������ ();
		
		Student kana= new Student();
		
		//�ı�����еĳ�Ա��������
		//���Ҳ���ַ�������ֵ��������name��Ա����
		kana.name="�ؾ���";
		kana.age=18;
		
		//ʹ�ó�Ա����
		System.out.println("�ҵ�������: "+ kana.name);
		System.out.println("����: "+kana.age);
		System.out.println("=================");
		
		//ʹ�ó�Ա����
		//������.��Ա����();
		kana.eat();
		kana.sleep();
		kana.study();
		
		Student mori= new Student();
		mori.eat();
		
		
		
	    }
	}
