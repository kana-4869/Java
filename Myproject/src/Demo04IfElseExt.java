//x��y�Ĺ�ϵ�������£�
//���x >=3,��ôy=2x+1��
//���-1<X<3����ôy=2x��
//���x <= -1,��ôy=2x-1��

//else if��������������׷�ӡ�



public class Demo04IfElseExt {
	public static void main(String[] args) {
		int x=-10;
		int y;
		
		if (x >=3) {
			y=2*x+1; //������û��2x����д�������Ҫ�����ѧ�е�2x��Ҫ�����д��2*x��
		} else if (-1<x && x<3) {
			y=2*x;//(-1<X<3) ����д����������ʽ���������䣬һ��Ҫ�����
		
			
		} else {
			y=2*x-1;
			
		}
		System.out.println("����ǣ�"+y);
	}

}
