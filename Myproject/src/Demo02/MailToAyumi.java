package Demo02;

public class MailToAyumi {
	
	public static void main(String[] args) {
		//根据phone类创建一个名为phone的对象
		//类名称 对象名= new 类名称 ();
		Phone ayu= new Phone ();
		
		ayu.brand="iphone";
		ayu.color="祖母绿";
		ayu.price=1000000.0;
		
		System.out.println("滨崎步手机:"+ayu.brand);
		System.out.println("手机颜色:"+ayu.color);
		System.out.println("手机价格:"+ayu.price);
		
		//成员方法调用
		
		
		ayu.call("midori");
		ayu.sendMessage();
		ayu.pNumber(8000);
		
		
		
		
	}

}
