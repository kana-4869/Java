package Demo02;

public class Person {
	public static void main(String[] args) {
		
		Student kana= new Student();
		kana.name="�ؾ���";
		kana.age=18;
		
		System.out.println("�ҵ�������: "+ kana.name);
		System.out.println("����: "+kana.age);
		System.out.println("=================");
		kana.eat();
		kana.sleep();
		kana.study();
		
		Student mori= new Student();
		mori.eat();
		
		
	    }
	}