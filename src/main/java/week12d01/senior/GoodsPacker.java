package week12d01.senior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class GoodsPacker {

    public int packGoods(int[][] types, int capacity){
        List<Good> goods = loadGoods(types);
            sort(goods, Comparator.comparingInt(Good::getRate));
            reverse(goods);
            int sumValue = 0;
            int cap = 0;
            for (Good g : goods) {
                while ((cap + g.getKg()) <= capacity) {
                    sumValue += g.getValue();
                    cap += g.getKg();
                }
            }
            return sumValue;
        }

        private List<Good> loadGoods(int[][] types) {
            List<Good> goods = new ArrayList<>();
            for (int[] i : types) {
                goods.add(new Good(i[0], i[1]));
            }
            return goods;
        }

    }



//Készíts egy GoodsPacker osztályt, melynek van egy int packGoods(int[][] types, int capacity) metódusa. A types
// tömb számpárokat tartalmaz, melyek tárgyak súlyát és értékét tartalmazzák, például: [(7, 160), (3, 90), (2, 15)].
// Az első szám a súly kilogrammban, a második szám az érték forintban. A feladat az, hogy kiszámoljuk, hogy a megadott
// táskamérethez (capacity) mennyi a tárgyak maximum értéke, amit belepakolhatunk a táskába. Például ha a
// types [(7, 160), (3, 90), (2, 15)] és a capacity 20, akkor a maximum érték 555.