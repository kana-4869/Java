package Demo03;

public class Demo03Person {
	
	public static void main(String[] args) {
		Person detail=new Person();
		
	
		detail.setName();
		detail.setAge(20);
		detail.show();
		//����û�е���getAge�ķ�������Ȼ���Դ�ӡ�������ֵ������Ϊshow���������Ѿ�
		//������д��ȥ�ˡ�
		
		System.out.println("=============");
		
		detail.name="���鲽";
		detail.setAge(30);
		System.out.println("�ҽУ�"+detail.name+" "+"���䣺"+detail.getAge());
		
		//û����show����������£�ֻ��ͨ����ӡset��get�ķ���������ȡ��������ݡ�	
	}
	

	
	
	

}
