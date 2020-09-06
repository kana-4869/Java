/*
 * 构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，
 * 其实是在调用方法。
 * 格式:
 * public 类名称(参数类型 参数名称){
 * 方法体
 * }
 * 
 * 注意事项：
 * 1.构造方法的名称必须和所在的类名称完全一样，包括大小写；
 * 2.构造方法不要写返回值类型，连void都不要写；
 * 3.构造方法不能写return具体的返回值；
 * 4.如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，
 * 没有参数，方法什么事情都不做。
 * public Student(){
 * }
 * 5.一旦编写了至少一个构造方法，那么编译器将不再赠送。
 * 6.重载：方法名称相同，参数列表不同，如下有两个student方法，但一个无参，一个有参。
 */


package Demo04;

public class Student {

	//无参数的构造方法
	public Student() {
		System.out.println("无参数的构造方法执行啦");
	}
	
	
	//有参数的构造方法
	String name;
	int age;
	public Student(String name,int age) {
		this.name="kana"; //取的是局部参数里面的值
		this.age=18;//取的是局部参数里面的值
		
		System.out.println("有参数的构造方法执行啦");
	}
	
	//当对象的值产生变化的时候，写set和get方法还是有用的。
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
	
