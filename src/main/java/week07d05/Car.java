package week07d05;

public class Car extends Vehicle{

    public Car(int numberOfGears, TransmissionType transmissionType) {
        super(5, TransmissionType.AUTOMATIC);
    }

    @Override
    public int getNumberOfGears() {
        return numberOfGears();
    }

    @Override
    public TransmissionType getTransmissionType() {
        return TransmissionType();
    }
}
