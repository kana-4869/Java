package kanastudy;

public class PrintTriangle01 {
	public static void main(String[] args) {
	
	 //µ¹Èý½ÇÑ­»·

    for(int i = 6; i > 0; i--) {
        for (int k = 6 - i; k > 0; k--) {
            System.out.print(" ");
        }

        for (int j = i; j > 0; j--) {
            System.out.print("* ");
        }

        System.out.println();
    }
	  }
}
