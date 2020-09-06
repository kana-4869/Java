/*
 * 1.导包：也就是指出需要使用的类，在什么位置。
 * import包名称.类名称；
 * import Demo02.Person;
 * 对于和当前属于同一个包的情况下，导包语句可省略不写。
 * 
 * 2.创建，格式：
 * 类名称 对象名= new 类名称 ();
 * Student stu= new 类名称();
 * 
 * 3.使用，分两种情况：
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名（参数）
 * 也就是想用谁，就用对象名.谁
 * 
*/

package Demo02;

import Demo01.ArrayReturn;

public class Person {
	public static void main(String[] args) {
		//类名称 对象名= new 类名称 ();
		
		Student kana= new Student();
		
		//改变对象当中的成员变量内容
		//将右侧的字符串，赋值交给左侧的name成员变量
		kana.name="贺君雯";
		kana.age=18;
		
		//使用成员变量
		System.out.println("我的名字是: "+ kana.name);
		System.out.println("芳龄: "+kana.age);
		System.out.println("=================");
		
		//使用成员方法
		//对象名.成员方法();
		kana.eat();
		kana.sleep();
		kana.study();
		
		Student mori= new Student();
		mori.eat();
		
		
		
	    }
	}
