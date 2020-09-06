package Demo04;

public class GetAyuDetail {
	
	public static void main(String[] args) {
		AyuDetail ayu=new AyuDetail();
		ayu.setName("浜崎あゆみ");
		ayu.setAge(18);
		System.out.println("姓名："+ayu.getName()+"   年龄："+ayu.getAge());
		
		System.out.println("===============================");
		
		AyuDetail ayu2=new AyuDetail("浜崎あゆみ",18);
		System.out.println("姓名："+ayu2.getName()+"   年龄："+ayu2.getAge());
		ayu2.setAge(30);
		System.out.println("姓名："+ayu2.getName()+"   年龄："+ayu2.getAge());
	}

}
