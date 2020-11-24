package week05d02;

public class ChangeLetter {

    public static final String VOWELS = "aeiou";
    public static final String STAR = "*";

    public String changeVowels(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            String c = text.substring(i, i + 1);
            if (VOWELS.contains(c)) {
                builder.append(STAR);
            }
        }
                return builder.toString();
            }


        }


