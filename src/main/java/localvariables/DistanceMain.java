package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(55.55, false);
        System.out.println(distance.getDistanceInKm() +" " + distance.isExact());
        int whole = (int) distance.getDistanceInKm();
        System.out.println(whole);


    }
}
