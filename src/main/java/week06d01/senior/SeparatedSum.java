package week06d01.senior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparatedSum {

    public Double[] separatedSum(String s) {
        s = s.replace(",",".");
        String[] arr = s.split(";");
       List<Double> doubles = doubleParser(arr);
        double sumPositive=0.0;
        double sumNegative=0.0;
       Double[] result = new Double[2];
                    for(Double i : doubles) {
                if (i > 0) {
                    sumPositive = sumPositive + i;
                } else {
                    sumNegative = sumNegative + i;
                }
                result[0] = sumPositive;
                result[1] = sumNegative;

            }return result;

        }


    private List<Double> doubleParser(String[] arr) {
        List<Double> doubles = new ArrayList<>();
        for(String item: arr) {
            doubles.add(Double.parseDouble(item));
        }
        return doubles;
    }

    public static void main(String[] args) {
        SeparatedSum ss = new SeparatedSum();
        System.out.println(Arrays.toString(ss.separatedSum("12,13;-14,15;-15,16;16,17;-20,18;18,19")));
    }
}

//Írj egy SeparatedSum.sum(String s) metódust, mely kap egy String-et, melyben lebegőpontos számok szerepelnek
// pontosvesszővel elválasztva. A számoknál vessző a tizedeselválasztó. Ezt szétszedi, és összeadja külön a pozitív
// és külön a negatív számokat. Mivel térnél vissza ebből a metódusból?
//  "12,13;-14,15;-15,16;16,17;-20,18;18,19"