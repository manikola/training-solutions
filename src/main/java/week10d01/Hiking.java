package week10d01;



import java.util.ArrayList;
import java.util.List;

public class Hiking {


    public static double getPlusElevation(List<Double> height) {
        double sum = 0;
        for (int i = 1; i < height.size(); i++) {
            if (height.get(i) > height.get(i-1)) {
                sum += (height.get(i) - height.get(i-1));
            }

        }
        return sum;
    }






    public static void main(String[] args) {
        List<Double> points = new ArrayList();
        points.add(10.0);
        points.add(20.0);
        points.add(15.0);
        points.add(18.0);

        System.out.println(getPlusElevation(points));
    }
}
