package week05d02;

public class ChangeLetter {

    public static final String VOWELS = "aeiou";
    public static final String STAR = "*";

    public String changeVowels(String text) {
        text = text.toLowerCase();
        char[] eng = {'a', 'e', 'i', 'o', 'u'};
        for (char c : eng) {
            text = text.replace(c, '*');
        }
        return text;
    }

    public static void main(String[] args) {
        ChangeLetter changeLetter = new ChangeLetter();
        System.out.println(changeLetter.changeVowels("Supercalifragilisticexpialidocious"));
    }


        }


