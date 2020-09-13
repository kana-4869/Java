package Demo06;

import java.util.ArrayList;


/*
 * ArrayList常用的方法有:
 
 * public boolean add(E e):向集合中添加元素，参数的类型要和尖括号一致。
 * 备注:对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
 * 但对于其他集合(今后学习)来说，add添加动作不一定成功。所以添加返回值代表是否成功。
 * 
 * public E get(int index):从集合中获取元素，参数是索引编号，返回值就是对应位置
 * 的元素。
 * 
 * public E remove(int index):从集合当中删除元素， 参数是索引编号，返回值就是
 * 被删除的元素。
 * 
 * public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数。
 */
/**
 * @author kana
 *
 * 2020年9月13日
 */
public class ArrayListMethod {
	public static void main(String[] args) {
		
		ArrayList<String> list=	new ArrayList<>();
		System.out.println(list);
		
		//向集合中添加元素
		boolean success= list.add("YOSHIKI");
		System.out.println(list);
		System.out.println("添加的动作是否成功: "+success);//true;
		
		list.add("gack");
		list.add("ayumi");
		list.add("masa");
		System.out.println(list);
		
		//从集合中获取元素：get.索引值从0开始。
		String name=list.get(2);
		System.out.println("获取的2号元素是："+name);
		
		//从集合中删除元素：remove。索引值从0开始。
		String whoremoved=list.remove(3);
	    System.out.println("被删除的3号元素是："+whoremoved);
	    System.out.println(list);
	    
	    //获取集合的尺寸长度
	    int size=list.size();
	    System.out.println("集合的长度是："+size);
	}

	
}
