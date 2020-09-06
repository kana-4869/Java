package Demo01;


//求数组元素中的最大值
 
public class ArrayMax {
	public static void main(String[] args) {
	
		int[] arrayA= {0,15,20,10,100,99,76,1000};
		int max=arrayA[0];
		
		
		for(int i=1; i<arrayA.length;i++) {
			/*因为计算出最大值，需要将大于arrayA[0]也就是10的值赋值
			 * 给max，以此类推，所以max<arrayA[i]
			 */
			
			if(max<arrayA[i]) {
				max=arrayA[i];
				
			}
			
		}
		System.out.println("最大值是: "+max);
		
		System.out.println("======================================= ");
		
		//求数组元素中的最小值
		
		int min=arrayA[0];
		
		for(int i=1;i<arrayA.length;i++) {
			if(min>arrayA[i]) {
				min=arrayA[i];
				/*因为计算出最小值，需要将小于arrayA[0]也就是0的值赋值
				 * 给min，以此类推，所以min>arrayA[i]
				 */
			}
		}
		System.out.println("最小值是："+min);
	}

}
