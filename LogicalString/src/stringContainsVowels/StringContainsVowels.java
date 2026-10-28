package stringContainsVowels;

public class StringContainsVowels {

	public static void main(String[] args) {
		 String str= "TV";
		 boolean itsVowel = itsVowel(str);
		 System.out.println(itsVowel);
	}

	private static boolean itsVowel(String str) {
		 return str.toLowerCase().matches(".*[aeiou].*");
	}
}
