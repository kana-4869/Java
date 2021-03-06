/*
 * 问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来。
 * 解决方案：用private关键字将需要保护的成员变量进行修饰。
 * 
 * 一旦使用了private进行修饰，那么本类当中仍然可以随意访问，
 * 但是！超出了本类范围之外就不能直接访问了。
 * 
 */

package Demo03;

public class Person {
	
	String name;
	private int age;
	
	public void show() {
		System.out.println("我叫："+name+","+"年龄："+age);
	}
	
	public void setAge(int num) {
		//这个成员方法，专门用于向age设置数据
		if(num<100 && num>0) {
			age=num;
		}else {
			System.out.println("数据不合理");
		}
		
	}
	//这个成员方法，专门用于获取age的数据
    public int getAge() {
	
	return age;
}

	public void setName() {
		name="滨崎步";
		
		
	}
	
	

}
