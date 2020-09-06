//使用对象类型作为方法的参数

package Demo02;

public class PhoneParam {
	
	public static void main(String[] args) {
		
		Phone one=new Phone();
		one.brand="三星";
		one.color="red";
		one.price=8800.0;
		
		
		method(one,10087,"kana");
		
		System.out.println("==========");
		
		Phone two=new Phone();
		
		two.brand="lv";
		two.color="white";
		two.price=11000.0;
		
		method(two,10086,"kana");
	
	}
	
	public static void method(Phone param,int pNumber,String who) {
		System.out.println(param.brand);
		System.out.println(param.color);
		System.out.println(param.price);
		
		param.pNumber(pNumber);
		param.call(who);
		param.sendMessage();
       //method括号里面调用了phone这个类里面的pNumber，who方法
		
	}

}
