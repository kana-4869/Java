package Demo01;

public class Array {

	public static void main(String[] args) {
		
		int[] arrayA= new int[5];
		
		arrayA[0]=10;
		arrayA[1]=11;
		arrayA[2]=12;
		arrayA[3]=100;
		arrayA[4]=111;
		
		System.out.println(arrayA[0]);
		
		System.out.println(arrayA.length);
		for (int i : arrayA) {
			System.out.println(i);
		}
		
//		for(int i=0;i<arrayA.length;i++) {
//		
//			System.out.println(arrayA[i]);
//	
//
//		}
	}
		
	
	
}
