package week11d03.senior;

public class CharCounter {

    public int countChars(String[] chars) {
        char[] temp = chars[0].toCharArray();
        int count = 0;
        boolean b = true;
            for (char item : temp) {
                for(String s : chars){
                    if(s.indexOf(item) <0){
                        b = false;
                    }
        }
                if(b == true){
                    count++;
                }
    }
            return count;
}
}

//Készítsünk egy CharCounter osztályt, melyben van egy int countChars(String[] chars) metódus. A feladat az, hogy
// összeszámoljuk azokat a karaktereket asz összes chars-ban lévő String-ből, amelyek mindegyik String-ben szerepelnek.
// Példa: Ha a chars-ban ["abc", "cba", "ab"] szerepel, akkor a visszatérési érték 2, mert az a és a b karakter
// szerepel mindegyik String-ben.
