/*
 * ��������������Person������ʱ���޷���ֹ����������ֵ�����ý�����
 * �����������private�ؼ��ֽ���Ҫ�����ĳ�Ա�����������Ρ�
 * 
 * һ��ʹ����private�������Σ���ô���൱����Ȼ����������ʣ�
 * ���ǣ������˱��෶Χ֮��Ͳ���ֱ�ӷ����ˡ�
 * 
 */

package Demo03;

public class Person {
	
	String name;
	private int age;
	
	public void show() {
		System.out.println("�ҽУ�"+name+","+"���䣺"+age);
	}
	
	public void setAge(int num) {
		//�����Ա������ר��������age��������
		if(num<100 && num>0) {
			age=num;
		}else {
			System.out.println("���ݲ�����");
		}
		
	}
	//�����Ա������ר�����ڻ�ȡage������
    public int getAge() {
	
	return age;
}

	public void setName() {
		name="���鲽";
		
		
	}
	
	

}