package Demo03;

public class Demo03Person {
	
	public static void main(String[] args) {
		Person detail=new Person();
		
	
		detail.setName();
		detail.setAge(20);
		detail.show();
		//以上没有调用getAge的方法，依然可以打印出年龄的值，是因为show方法里面已经
		//把年龄写进去了。
		
		System.out.println("=============");
		
		detail.name="滨崎步";
		detail.setAge(30);
		System.out.println("我叫："+detail.name+" "+"年龄："+detail.getAge());
		
		//没有用show方法的情况下，只能通过打印set和get的方法，来获取年龄的数据。	
	}
	

	
	
	

}
