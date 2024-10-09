package Basics;

public class VowelConso {

	public static void main(String[] args) {
		String s ="Ragini";
		int vowel =0;
		int conso =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A'&& ch<='Z' || ch>='a' && ch<='z') {
				if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U') {
					vowel++;
					
				}
				else {
					conso++;
				}
			}
				
		}
		System.out.println("Vowels:"+vowel);
		System.out.println("Conso:"+conso);
	}

}
