/*
 * 一个标准的类通常需要以下四个组成部分：
 * 1.所有的成员变量都要使用private关键字修饰；
 * 2.为每一个成员变量编写一对get和set方法
 * 3.编写一个无参构造方法
 * 4.编写一个全参构造方法
 * 
 * 这样标准的类也叫做Java Bean
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
