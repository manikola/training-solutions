package literals;

import java.sql.SQLOutput;

public class LiteralsMain {

    public static void main(String[] args) {
        System.out.println("1" + "2");
        System.out.println(1 + "" + 2);
        System.out.println(Integer.toString(1) + Integer.toString(2));


        double quotient = 3d / 4d;
        System.out.println(quotient);//amikor 3 és 4 int, akkor 0.0 lett

        long big = 3_244_444_444L;
        System.out.println(big);

        String s = "árvíztűrőtükörfúrógép!";
        System.out.println(s);

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));


    }

}
