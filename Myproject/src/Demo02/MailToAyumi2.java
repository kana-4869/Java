package Demo02;

public class MailToAyumi2 {
	
  public static void main(String[] args) {
	  
		//根据phone类创建一个名为phone的对象
		//类名称 对象名= new 类名称 ();
		Phone ayu2= new Phone ();
		
		ayu2.brand="huawei";
		ayu2.color="骚红";
		ayu2.price=2000000.0;
		
		System.out.println("ayu的手机:"+ayu2.brand);
		System.out.println("颜色:"+ayu2.color);
		System.out.println("价格:"+ayu2.price);
		
		//成员方法调用
		
		
		ayu2.call("给滨崎步打电话");
		ayu2.sendMessage();
		
	}

}



