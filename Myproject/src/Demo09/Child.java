package Demo09;

public class Child extends Father{
       int num=20;
       
       public void method() {
    	   int num=30;
    	   
    	   System.out.println(num);//30,�ֲ�����
    	   System.out.println(this.num);//20������ĳ�Ա����
    	   System.out.println(super.num);//10������ĳ�Ա����
       }

	
	}
       

