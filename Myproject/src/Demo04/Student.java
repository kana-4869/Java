/*
 * ���췽����ר��������������ķ�����������ͨ���ؼ���new����������ʱ��
 * ��ʵ���ڵ��÷�����
 * ��ʽ:
 * public ������(�������� ��������){
 * ������
 * }
 * 
 * ע�����
 * 1.���췽�������Ʊ�������ڵ���������ȫһ����������Сд��
 * 2.���췽����Ҫд����ֵ���ͣ���void����Ҫд��
 * 3.���췽������дreturn����ķ���ֵ��
 * 4.���û�б�д�κι��췽������ô����������Ĭ������һ�����췽����
 * û�в���������ʲô���鶼������
 * public Student(){
 * }
 * 5.һ����д������һ�����췽������ô���������������͡�
 * 6.���أ�����������ͬ�������б�ͬ������������student��������һ���޲Σ�һ���вΡ�
 */


package Demo04;

public class Student {

	//�޲����Ĺ��췽��
	public Student() {
		System.out.println("�޲����Ĺ��췽��ִ����");
	}
	
	
	//�в����Ĺ��췽��
	String name;
	int age;
	public Student(String name,int age) {
		this.name="kana"; //ȡ���Ǿֲ����������ֵ
		this.age=18;//ȡ���Ǿֲ����������ֵ
		
		System.out.println("�в����Ĺ��췽��ִ����");
	}
	
	//�������ֵ�����仯��ʱ��дset��get�����������õġ�
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
}
	
