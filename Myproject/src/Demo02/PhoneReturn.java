//ʹ�ö���������Ϊ�����ķ���ֵ

package Demo02;

public class PhoneReturn {
	
	public static void main(String[] args) {

		Phone two=getPhone();
		System.out.println(two.brand);
		System.out.println(two.color);
		System.out.println(two.price);
		
	}
	
	public static Phone getPhone() {
		Phone one=new Phone();
		one.brand="���ζ�";
		one.color="�ڽ�";
		one.price=8888.0;
		return one;
		
	}

}