package week07d05;

public class Vehicle {


    public int numberOfGears;
    public TransmissionType transmissionType;

    public Vehicle() {
        this(5, TransmissionType.MANUAL);
    }

    public Vehicle(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = TransmissionType.MANUAL;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }
}
