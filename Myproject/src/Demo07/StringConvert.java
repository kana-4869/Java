package Demo07;

/*String輝嶄嚥廬算�犢惶蝶Ｓ歎酬�嗤��
 * public char[] toCharArray():繍輝念忖憲堪介蛍撹忖憲方怏恬葎卦指峙��
 * public Byte[] getBytes():資函輝念忖憲堪久蚊議忖准方怏��
 * public replace(CharSequence oldString��CharSequence newString):
 * 繍侭嗤竃�峙沈�忖憲堪紋算撹仟忖憲堪��卦指紋算岻朔議仟忖憲堪。
 * 
 */

/**
 * @author kana
 *
 * 2020定10埖17晩
 */
public class StringConvert {
	
	public static void main(String[] args) {
		
		//繍輝念忖憲介蛍撹忖憲方怏
		
		char[] chars="sequence".toCharArray();
		System.out.println(chars[3]);
		System.out.println("忖憲議海業頁��"+chars.length);
		
		//廬算撹忖准方怏
		
		byte[] bytes = "abc".getBytes();
		
		for(int i=0; i<bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		
		//析忖憲堪紋算撹仟忖憲堪
		
		String str1="あんなやつ、やめちゃえば�殖�";
		String str2=str1.replace("やめちゃえば", "******");
		System.out.println(str1);
		System.out.println(str2);
		
		
		
		
		
		
		
	}

}
