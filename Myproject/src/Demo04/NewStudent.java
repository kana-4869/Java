package Demo04;

public class NewStudent {
	
	public static void main(String[] args) {
		
		Student stu1=new Student();
		
		System.out.println("==============================");
		
		Student stu2=new Student("kana",18);//ȫ�ι��췽��
		System.out.println("����:"+stu2.name);
		System.out.println("����"+stu2.age);
		
		System.out.println("============================");
		stu2.setAge(21);
		stu2.setName("kanami");
		System.out.println("����:"+stu2.getName()+" "+"����:"+stu2.getAge());
	}

	
}