//数组元素反转

package Demo01;

public class ArrayReverce2 {
	
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(int min=0,max =array.length-1;min<max;min++,max--) {
			int temp=array[min];// temp=数组array[0]
			array[min]=array[max];
			array[max]=temp;
		}
		System.out.println("-----------------");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	


}
