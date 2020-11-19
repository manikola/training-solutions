package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        if (word == null || "".equals(word)) {
            throw new IllegalArgumentException("Text cannot not be empty");
        }
        word = word.trim();

        StringBuilder stringbuilder = new StringBuilder(word);
        return word.equalsIgnoreCase(stringbuilder.reverse().toString());

    }
}
