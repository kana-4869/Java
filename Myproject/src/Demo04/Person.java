/*
 * 当方法的局部变量和类的成员变量重名时，根据“就近原则”，
 * 优先使用局部变量。
 * 如果需要访问成员变量，需要使用特殊的格式：
 * this.成员变量名
 * 
 * “通过谁调用的方法，谁就是this”
 * 
 */

package Demo04;

public class Person {

	String name;
	
	public void sayHello(String name) {
		
		System.out.println(name+"你好，我是"+this.name);
	}
}
