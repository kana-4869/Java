package kanastudy;

public class sum100 {
	public static void main(String[] args) {
		int sum=0;		
		for (int i = 0; i <= 3; i++) {
		sum+=i;
	}
		System.out.println(sum);
		System.out.println("==========================");
		
		
		SUM();
		System.out.println("==========================");
		
		System.out.println(SUM1(0,100));
		
	}
	
	public static void SUM() {
		int sum=0;
		for (int i = 0; i <= 100; i++) {
			sum+=i;	
		}
		System.out.println(sum);
	} 
	
	
	public static int SUM1(int a,int b) {
		int sum=0;
		for (int i = a; i <= b; i++) {
			sum+=i;	
		}
		return sum;
	} 
	
	
	
	
	
	
	
	
	

}
