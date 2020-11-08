package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        System.out.println(new CircleCalculator().calculateArea(5));
        System.out.println(new CircleCalculator().calculatePerimeter(5));

        System.out.println(new CylinderCalculator().calculateVolume(5, 11));
        System.out.println(new CylinderCalculator().calculateSurfaceArea(5, 8));

        System.out.println("Pi = " + CircleCalculator.PI);

    }
}
