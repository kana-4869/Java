/*
 * һ����׼����ͨ����Ҫ�����ĸ���ɲ��֣�
 * 1.���еĳ�Ա������Ҫʹ��private�ؼ������Σ�
 * 2.Ϊÿһ����Ա������дһ��get��set����
 * 3.��дһ���޲ι��췽��
 * 4.��дһ��ȫ�ι��췽��
 * 
 * ������׼����Ҳ����Java Bean
 * 
 */

package Demo04;

/**
 * @author kana
 *
 */
public class AyuDetail {
	
	private String name;
	private int age;
	
	public AyuDetail() {
		
	}
	
	public AyuDetail(String name, int age) {
	
		this.name = name;
		this.age = age;
	}

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	

}
