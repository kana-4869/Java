package kanastudy;

public class IsosclesTriangle {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int y=10;y>=i;y--) {
				System.out.print(" "); 
				//���������ο��Էֳ��������֣��ȴ�ӡ�հ׵ĵ�ֱ��������
			
			}
			for(int y=1;y<=i;y++) {
				System.out.print("*");//�ٴ�ӡ�м俿�����ֱ��������
			}
			for(int y=1;y<i;y++) {
				System.out.print("*");
				//�ٴ�ӡ���ҷ����ֱ��������y<i�����Ե�һ��û��*
			}
			
			
			
			System.out.println(" "); //ÿ��ӡ���һ�Σ�����ת�С�
			
			
		}
		
	}

}
