package week08d01.senior;

import java.util.ArrayList;
import java.util.List;

public class Sultan {

    private boolean[] prison = new boolean[100];

    public Sultan() {
        for(int i = 0; i < 100; i++){
            prison[i] = false;
        }
    }
    public List<Integer> openDoors() {
        for( int i = 0; i < i; i++){
            for( int j = 0; j < prison.length; j++) {
                if((j+1) % (i+1) ==0){
                    if(prison[j] = true) {
                        prison[j] = false;
                    }
                    else {
                        prison[j] = true;
                    }
                }
            }
        }
        List<Integer> openList = new ArrayList<>();
        for (int i = 0; i < prison.length; i++) {
            if (prison[i] == true) {
                openList.add(i+1);
            }
        }
        return openList;
    }
    public List<Integer> openDoorsBonus(int numberOfDays) {
        for (int i = 0; i < numberOfDays; i++) {
            for (int j = 0; j < prison.length; j++) {
                if ((j + 1) % (i + 1) == 0) {
                    if (prison[j] == true) {
                        prison[j] = false;
                    } else {
                        prison[j] = true;
                    }
                }
            }
        }

        List<Integer> openList = new ArrayList<>();
        for (int i = 0; i < prison.length; i++) {
            if (prison[i] == true) {
                openList.add(i+1);
            }
        }
        return openList;
    }
}



//A török szultán elhatározza, hogy a 100 nap múlva lévő születésnapján szabadon enged néhány rabot a börtönéből.
// A börtönben 100 cella van. Mindegyik cella zárva van. Ha egyet fordítunk a kulcson akkor nyitva lesz, ha még
// egyet akkor zárva ha hármat akkor ismét nyitva és így tovább. A szultán azt a parancsot adja, hogy az első nap
// mindegyik cellán fordítsanak egyet. (Ekkor minden cella nyitva lesz). A második napon minden másodikon
// fordítsanak egyet, így minden második zárva lesz. A harmadik napon minden harmadikon fordítsanak egyet
// így a 3. cella zárva , de a 6. cella például nyitva lesz. A week08d01.Sultan osztályba írj egy metódust
// openDoors() néven, aminek visszatérési értékéből kiderül, hogy mely ajtók lesznek nyitva a 100. napon!
// Az osztály szabadon bővíthető!
