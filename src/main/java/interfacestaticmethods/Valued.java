package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValue();

    static double sum(List<Valued> items) {
        double result = 0;
        for (Valued valued : items) {
            result += valued.getValue();
        }
        return result;

    }
}
