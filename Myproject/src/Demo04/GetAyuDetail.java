package Demo04;

public class GetAyuDetail {
	
	public static void main(String[] args) {
		AyuDetail ayu=new AyuDetail();
		ayu.setName("��餢���");
		ayu.setAge(18);
		System.out.println("������"+ayu.getName()+"   ���䣺"+ayu.getAge());
		
		System.out.println("===============================");
		
		AyuDetail ayu2=new AyuDetail("��餢���",18);
		System.out.println("������"+ayu2.getName()+"   ���䣺"+ayu2.getAge());
		ayu2.setAge(30);
		System.out.println("������"+ayu2.getName()+"   ���䣺"+ayu2.getAge());
	}

}