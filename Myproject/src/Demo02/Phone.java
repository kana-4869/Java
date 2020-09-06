/*
 * 定义一个类，用来模拟“手机”事物
 * 属性：品牌，颜色，价格
 * 行为：短信，打电话
 * 
 * 对应的类
 * 成员变量（属性）
 * string brand；品牌
 * string color；颜色
 * double price；价格
 * 
 * 成员方法（行为）
 * 
 * public void call（string who）{}//打电话
 * public void sendMessage（）{}//群发短信
 */

package Demo02;

public class Phone {
	
	String brand;
	Double price;
	String color;
	
	public void call(String who) {
		System.out.println("我叫"+who);
	}
	public void sendMessage() {
		System.out.println("短信内容：I will support you forever");
	}
	public void pNumber(int phoneNumber) {
		System.out.println(phoneNumber);
	}

	
}
