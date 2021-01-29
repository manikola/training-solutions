package week13d05;


import java.util.HashSet;
import java.util.Set;

public class Characters {

    public int characterCounter(String word) {
        char[] arr = word.toLowerCase().toCharArray();
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (isEnglishChar(arr[i])) {
                characters.add(arr[i]);
            }
        }
        return characters.size();

    }

    private boolean isEnglishChar(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }return false;
    }


    public static void main(String[] args) {
        Characters chr = new Characters();
        System.out.println(chr.characterCounter("alma"));
        System.out.println(chr.characterCounter("Anna   !!!"));
        System.out.println(chr.characterCounter("alma-alma"));
    }
}






