package exam02;

public class ArraySelector {

    public static String selectEvens(int[] numbers) {
        String s = "";
        if (numbers.length > 0){
            s = s +"[";
        }
        for (int i = 0; i < numbers.length; i = i + 2) {
            s = s + numbers[i];
            if (i + 2 < numbers.length) {
                s = s + ", ";
            } else {
                s = s + "]";
            }
        }
        return s;
    }
}

