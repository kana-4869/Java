package Demo04;

public class NewStudent {
	
	public static void main(String[] args) {
		
		Student stu1=new Student();
		
		System.out.println("==============================");
		
		Student stu2=new Student("kana",18);//全参构造方法
		System.out.println("姓名:"+stu2.name);
		System.out.println("年龄"+stu2.age);
		
		System.out.println("============================");
		stu2.setAge(21);
		stu2.setName("kanami");
		System.out.println("姓名:"+stu2.getName()+" "+"年龄:"+stu2.getAge());
	}

	
}
