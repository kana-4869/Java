package Demo10;

/*
 * 在父子类的继承关系中，创建子类对象，访问成员方法的规则:
 * 创建的对象是谁，就有限用谁的方法，如果没有，则往上找。
 */

public class ExtendsMethod {
	
	public static void main(String[] args) {
		
		Zi zi= new Zi();
		
		zi.methodFu();
		zi.methodZi();
		zi.method();
		
		//创建的是new的子类对象，所以优先运行子类
	}
	
}






