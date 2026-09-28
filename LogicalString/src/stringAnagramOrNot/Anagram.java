package stringAnagramOrNot;

public class Anagram {

	public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // First check length
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        // Compare
        if (java.util.Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
