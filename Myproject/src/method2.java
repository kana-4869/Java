
public class method2 {
	public static void main(String[] args) 
	{	
     String sum = method2.sendmsg("10086","您的电话已欠费");
		System.out.println(sum);

	}	
	static  String sendmsg(String X,String Y)
	{
	return "收件人：" + X+" "+"内容："+Y;		
	}

}
