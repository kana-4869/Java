/*
 * 成员变量和局部变量
 * 1.定义的位置不一样【重点】
 * 局部变量：在方法的内部
 * 成员变量：在方法的外部，在类的里面
 * 
 * 2.作用范围不一样【重点】
 * 局部变量：只有方法当中可以用，出了方法就不能用
 * 成员变量：整个类都可以通用
 * 
 * 3.默认值不一样【重点】
 * 局部变量：没有默认值，如果要想用，必须手动进行赋值
 * 成员变量：如果没有赋值，会有默认值，规则和数组一样。
 * 
 */



package Demo03;

public class Demo01VariableDiffrence {
	
	String name;//成员变量


public void method() {
	
	int num=10;//局部变量
	System.out.println(num);
}

public void method01(int param) {
	//System.out.println(num);
	System.out.println(name);//string是成员变量，可以通用
	//错误写法，因为num这个是局部变量，
	//只能在上一个方法里面用
	
	int age;
	//System.out.println(age);错误写法，局部变量必须手动赋值，是没有默认值的。
	System.out.println(param);
	//虽然方法的param参数是局部变量，但是却可以打印，参数在被方法调用时，
	//必然会被赋值。
}

}

