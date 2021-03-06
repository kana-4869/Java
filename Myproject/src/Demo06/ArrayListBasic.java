package Demo06;

/*
 * 如果希望在arraylist集合当中存储基本类型数据，必须使用基本类型对应的“包装类”。
 * 基本类型        包装类（引用类型，包装类都位于java.lang包下）
 * byte        Byte
 * short       Short
 * int         Integer【特殊】
 * long        Long
 * float       Float
 * double      Double
 * char        Character【特殊】
 * boolean     Boolean
 * 
 * 从JDK1.5开始，支持自动装箱，自动拆箱。
 * 自动装箱：基本类型-->包装类型（引用类型）int-->Integer
 * 自动拆箱：包装类型（引用类型）-->基本类型 Integer-->int
 */



import java.util.ArrayList;

/**
 * @author kana
 *
 * 2020年9月13日
 */
public class ArrayListBasic {

	public static void main(String[] args) {
		ArrayList<String> listA= new ArrayList<>();
		//如下为错误写法，泛型（尖括号里的内容）只能是引用类型（string）
		//不能是基本类型：float，double，char，Boolean都不行
		//ArrayList<int> listB= new ArrayList<>();
		
		//存入int类型的数据
		ArrayList<Integer> listC=new ArrayList<>();
		listC.add(100);
		listC.add(200);
		listC.add(300);
		System.out.println(listC);
		
		//将其中一号int类型元素从集合中取出
	    int num=listC.get(1);
	    System.out.println("第一号元素是："+num);
	    
	    //将其中一号int类型元素删除
	    int num1=listC.remove(1);
	    System.out.println("被删除的1号元素是："+num1);
	    System.out.println(listC);
		
	}
}
