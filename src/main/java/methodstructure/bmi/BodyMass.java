package methodstructure.bmi;

public class BodyMass {

    public static double LOWER_LIMIT = 18.5;
    public static double UPPER_LIMIT = 25.0;
    private double height;
    private double weight;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
    public double bodyMassIndex() {
        return weight / (height * height);

    }
    boolean isThinnerThan(BodyMass other) {
        return bodyMassIndex() < other.bodyMassIndex();
    }
    public BmiCategory body() {
        double bmi = bodyMassIndex();
        if (bmi < LOWER_LIMIT)
            return BmiCategory.UNDERWEIGHT;
        if (bmi > UPPER_LIMIT)
            return BmiCategory.OVERWEIGHT;
        return BmiCategory.NORMAL;
    }
}
