package Basics;

public class SeparateVC {

	public static void main(String[] args) {
		String s ="Ragini";
		String vowel ="";
		 String conso = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A'&& ch<='Z' || ch>='a' && ch<='z') {
				if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U') {
					vowel=vowel+ch;
					
				}
				else {
					conso=conso+ch;
				}
			}
				
		}
		System.out.println("Vowels:"+vowel);
		System.out.println("Conso:"+conso);
	}

}
