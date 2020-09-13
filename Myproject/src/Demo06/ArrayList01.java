package Demo06;

import java.util.ArrayList;

/*
 * 数组的长度不可以发生改变。
 * 但是对于arraylist来说，有一个尖括号<E>代表泛型，
 * 泛型：也就是装在集合当中的元素，全都是统一的类型。
 * 注意：泛型只能是引用类型，不能是基本类型。
 * 
 *  注意事项：
 *  对于arraylist来说，直接打印，得到的不是地址值，而是内容，
 *  如果内容是空，得到的是[]
 */


/**
 * @author kana
 *
 * 2020年9月13日
 */
public class ArrayList01{
	
	public static void main(String[] args) {
		
		//创建了一个arraylist的集合，集合的名称是list，
		//里面全部装的是string字符串类型的数据
		//备注：从jdk 1.7开始，右侧的<>里面可以不写内容，但<>本身还是要写的
		
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list);
		
		//向集合当中添加一些数据，需要用到add方法。
		list.add("浜崎あゆみ");
		list.add("倉木麻衣");
		list.add("西野カナ");
		System.out.println(list);
		
		
	}

}
