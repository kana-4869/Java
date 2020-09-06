//使用对象类型作为方法的返回值

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
		one.brand="香奈儿";
		one.color="黑金";
		one.price=8888.0;
		return one;
		
	}

}
