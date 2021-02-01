package week07d01.senior;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public long fib(int n){
        if ( n<0){
            throw new IllegalArgumentException("number must be positive");
        }
        List<Integer> fibo = new ArrayList<>();
        int a = 0;
        int b = 1;
        long nFibo = 0;
        fibo.add(a);
        fibo.add(b);
        for (int i = 2; i < (n+1); i++){
            fibo.add(fibo.get(i-2) + fibo.get(i-1));
        }
        nFibo = fibo.get(n);
        return nFibo;

    }


}
//Készíts egy osztályt Fibonacci néven! Legyen benne egy fib metódus, ami egy int n paramétert vár! A visszatérési
// értékünk legyen egy long szám, ami az n-edik fibonacci számot tartalmazza. (A fibonacci szám az az az előző kettő
// fibonacci szám összege és az első két szám az 1, 1.
//Bónusz feladat: implementáld az algoritmust ciklus nélkül és mentsd el a részeredményeket egy statikus változóba!
//Pontosítás: Ha n = 0, akkor 0-t adunk vissza, ha n = 1, akkor 1-et, ezért lesz a 2. elem szintén 1, mert 0 + 1 = 1