package week07d05;

public class MotorCycle extends Vehicle{


    private int numberOfGears;
    private TransmissionType transmissionType;

    public MotorCycle(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = 5;
        this.transmissionType = TransmissionType.SEQUENTIAL;
    }

}

