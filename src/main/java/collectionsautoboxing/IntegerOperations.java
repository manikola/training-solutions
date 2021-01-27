package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperations {

    public List<Integer> createList(int... numbers){
       List<Integer> integerList = new ArrayList<>();
       //for(Integer item: numbers){
           for(int item: numbers){
           integerList.add(item);
       }
       return integerList;
    }



    public int sumIntegerList(List<Integer> integerList){
        int sum = 0;
        for(Integer item : integerList){
            sum+= item;
        }
        return sum;

    }
    public int sumIntegerObjects(Integer... integers){
        int sum = 0;
        for(Integer item : integers){
            sum+= item;
        }
        return sum;
    }

}
