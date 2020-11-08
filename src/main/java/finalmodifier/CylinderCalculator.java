package finalmodifier;

public class CylinderCalculator {

    double calculateVolume(double r, double h) {
        return r * r * h * CircleCalculator.PI;

    }

    double calculateSurfaceArea(double r, double h) {
        return 2 * CircleCalculator.PI * r * (r + h);
    }

}
