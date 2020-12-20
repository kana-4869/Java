package Demo08;

/*在继承的关系中，“子类就是一个父类”，也就是说，子类可以当作父类看待，
 * 例如，父类是员工，子类是讲师，那么“讲师就是员工”。关系:is a.
 * 
 * 定义父类的格式:一个普通的类定义
 * public class 父类名称{
 *          //...
 * }
 * 
 * 定义子类的格式:
 * public class 子类名称{
 *         //...
 *         
 *   继承，主要是起到代码复用的效果。      
 * }
 */

public class Extends {

	public static void main(String[] args) {
		//创建一个子类对象
		Teacher teacher= new Teacher();
		
		//teacher类当中虽然什么都没写，但是会继承父类员工的method方法
	    Teacher.method();
	    
	    //创建另一个子类对象:助教
	    Assistant assistant= new Assistant();
	    Assistant.method();
	    
	}
}
