package Demo03;

public class Demo04Student {
	
	public static void main(String[] args) {
		Student stu=new Student();
		stu.setName("kana");
		stu.setAge(18);
		stu.setMale(true);
		
		System.out.println("������"+stu.getName());
		System.out.println("���䣺"+stu.getAge());
		System.out.println("�Ա�"+stu.isMale());
	}

}
