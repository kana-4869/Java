package Demo06;

import java.util.ArrayList;

/*题目：
 * 自定义4个学生对象，添加到集合，并遍历。
 * 
 * 思路：
 * 1.自定义student学生类，四个部分：
 * 所有的成员变量都用private
 * 有参和无参构造
 * 全参构造
 * 要写get，set。
 * 
 * 2.创建一个集合，用来存储学生对象。泛型：<Student>
 * 3.根据类，创建四个学生对象。
 * 4.将4个学生对象添加到集合中：add
 * 5.遍历集合：for，size，get
 * 
 */

public class ArrayListStudent {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		Student one=new Student("ayu",33);
		Student two=new Student("mai",35);
		Student three=new Student("namie",30);
		Student four=new Student("kana",23);
		
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		
		//遍历集合
		for(int i=0;i<list.size();i++) {
			Student stu=list.get(i);
			System.out.println("姓名: "+stu.getName()+" "+"年龄: "+stu.getAge());
		}
	}

}
