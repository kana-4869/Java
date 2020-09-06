package Demo04;

public class NewPerson {

	public static void main(String[] args) {
		Person per=new Person();
		
		per.name="小贺";
		per.sayHello("君雯");
		
		System.out.println(per);//打印结果是一串地址值
		
	}
}
