package week06d03.senior;

import java.util.ArrayList;
import java.util.List;

public class Series {

    public String calculateSeriesType(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            throw new IllegalArgumentException("List too short");
        }
        List<Integer> negativeDifference = new ArrayList<>();
        List<Integer> positiveDifference = new ArrayList<>();

        for (int i = 0; i < numbers.size() - 1; i++) {
            int diff = (numbers.get(i + 1) - numbers.get(i));
            if (diff < 0) {
                negativeDifference.add(diff);
            } else if (diff > 0) {
                positiveDifference.add(diff);

            }
        }
                String result = null;
                if (positiveDifference.size() > 0 && negativeDifference.size() == 0) {
                    result = "Ascending";
                } else if (positiveDifference.size() == 0 && negativeDifference.size() > 0) {
                    result = "Descending";
                } else if (positiveDifference.size() > 0 && negativeDifference.size() > 0) {
                    result = "Both";
                }

                return result;
            }
        }




//A Series osztályban hozz létre egy calculateSeriesType() metódust, mely egész számok listáját kapja, és eldönti,
// hogy növekvő, csökkenő vagy össze-vissza sorozatról van-e szó! Feltétel, hogy a bemeneti lista nem tartalmaz egymás
// után egyenlő értékeket. Ha a lista üres, vagy csak egy elemből áll, dobj kivételt! Mivel térnél vissza?
