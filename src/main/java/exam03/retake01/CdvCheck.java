package exam03.retake01;

import java.util.ArrayList;
import java.util.List;

public class CdvCheck {

    public static boolean check(String taxNumber){
        if( taxNumber.length() < 10 || taxNumber.length() >10){
            throw new IllegalArgumentException("Not valid tax number");
        }
        boolean b= false;

        int sum = 0;
       List<Integer> numbers = new ArrayList<>();
        for( int i=0; i<10; i++){

            numbers.add(Integer.parseInt(taxNumber.substring(i, i + 1)));
        }for(int i =0; i<9; i++){
            sum = sum + numbers.get(i) * (i+1);
        }
       if (sum % 11 == numbers.get(9)){
           b = true;

       }return b;


    }

    public static void main(String[] args) {
        System.out.println(CdvCheck.check("8365670003"));
    }


}
