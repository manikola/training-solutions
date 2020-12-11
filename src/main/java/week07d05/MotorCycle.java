package week07d05;

public class MotorCycle extends Vehicle{


    private int numberOfGears;
    private TransmissionType transmissionType;

    public Motorcycle() {
        super(5, TransmissionType.SEQUENTIAL);
    }
}
