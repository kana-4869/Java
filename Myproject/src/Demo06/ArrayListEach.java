package Demo06;

import java.util.ArrayList;


/**
 * @author kana
 *
 * 2020��9��13��
 */
public class ArrayListEach {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
		
		//��������
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i));
		}
	}
}
