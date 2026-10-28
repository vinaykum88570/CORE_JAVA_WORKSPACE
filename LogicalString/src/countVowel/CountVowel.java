package countVowel;

public class CountVowel {

	public static void main(String[] args) {
		
		String s ="hello";
		int vowel=0;
		int consonants=0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
				vowel++;
			}else {
				consonants++;
			}
		}
		System.out.println("vowel ="+vowel);
		System.out.println("consonants ="+consonants);
	}
}
